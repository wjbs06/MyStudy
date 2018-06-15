package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    private Socket socket = null;
    
    public void clientStart(String ip, String port){
        System.out.println("클라이언트 프로그램 작동.....");
        try {
            socket = new Socket(ip, Integer.parseInt(port));
            
            InetAddress ia = socket.getInetAddress();
            int local_port = socket.getLocalPort();// 접속에 사용된 PORT
            int server_port = socket.getPort();// 접속에 사용된 서버측 PORT
            String server_ip = ia.getHostAddress(); // 접속된 원격 Client IP
            
            System.out.print("클라이언트 접속-Local Port: "+ local_port);
            System.out.print(" Server IP: " + server_ip);
            System.out.println(" Server PORT: " + server_port);            
            
            //데이터를 읽어오는 스레드
            ChatClientReadHandler read = new ChatClientReadHandler(socket);
            read.start();
            //데이터를 보내는 스레드
            ChatClientSendHandler send = new ChatClientSendHandler(socket);
            send.start();
            
        } catch(IOException ioe) {
            System.err.println("연결이 되어 있지 않습니다.");
        } finally {
            try {
                if(socket == null){
                    socket.close();                    
                }
            } catch(IOException ignored) {}
        }
       
    }

    public static void main(String[] args) {
        Client cc = new Client();
        cc.clientStart("203.236.209.219", "3000"); // ip, port
    }
}