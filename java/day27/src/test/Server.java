package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    
    private Socket socket=null;
    private ServerSocket server = null;
    int connectCount=0;

    public void serverStart(){
        System.out.println("접속자를 기다리는 중입니다.");
        try {
            server = new ServerSocket(2010);
            socket = server.accept();
            
            InetAddress ia = socket.getInetAddress();
            int port = socket.getLocalPort();// 접속에 사용된 서버측 PORT 
            String ip = ia.getHostAddress(); // 접속된 원격 Client IP 
            
            ++connectCount;  //접속자수 카운트
            System.out.print(connectCount);
            System.out.print(" 접속-Local Port: "+ port);
            System.out.println(" Client IP: " + ip);
            
            //데이터를 읽어오는 스레드
            ChatServerReadHandler read = new ChatServerReadHandler(socket);
            read.start();
            //데이터를 보내는 스레드
            ChatServerSendHandler send = new ChatServerSendHandler(socket);
            send.start();
        } catch(IOException ioe) {
            System.err.println("연결이 되어 있지 않습니다.");
        } finally {
            try {
                server.close();
            } catch(IOException ignored) {}
        }
        
    }

    public static void main(String[] args) {
        Server cs = new Server();
        cs.serverStart();
    }
}