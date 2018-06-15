package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

class ChatClientSendHandler extends Thread{
    private Socket socket;
    private BufferedWriter writer;
    private BufferedReader in;           
    private String s="";

    public ChatClientSendHandler() {
        System.out.println("프로그램이 초기화 되지 않았습니다.");
    }
    
    public ChatClientSendHandler(Socket socket) {
        this.socket = socket;
        try{
            writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            in = new BufferedReader(new InputStreamReader(System.in));
        } catch (Exception e) {
            System.err.println("연결이 되어 있지 않습니다.");
        }   
    }

    public void run() {
        try {
            while(true) {
                System.out.print("▶ ");
                s = in.readLine(); //키보드로부터 입력
                if(s.equals("999")){
                    break; //종료코드
                }
                writer.write("▷ " + s);
                writer.newLine();  //줄바뀜 기호가 있어야 BufferedReader의 readLine()이 인식함
                writer.flush();
                //System.out.println("보낸 글:" + s);//입력받은 내용 출력
            }
        } catch(Exception ignored) {

        } finally {
            try {
                socket.close();
            } catch(IOException ignored) {}
        }
    }

}
