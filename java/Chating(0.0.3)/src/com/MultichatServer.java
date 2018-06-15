package com;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MultichatServer {
 
	// 대화명, 클라이언트 OutputStream 저장용 대화방(HashMap) 정의
	Map<String, DataOutputStream> clients; 
	
	// 생성자 
	MultichatServer() { 
		clients = Collections.synchronizedMap(new HashMap<String, DataOutputStream>());
	} 
	
    public void start() {
        ServerSocket serverSocket = null; 
        Socket socket = null; 

        try { 
            // 8998 포트에 바인딩된 서버 소켓 생성 
            serverSocket = new ServerSocket(3000);
             System.out.println("서버 시작 ... ");
 
            while (true) { 
                // 클라이언트 접속 대기 accept() 
                socket = serverSocket.accept(); 
                System.out.println("[" + socket.getInetAddress() 
                         + ":" + socket.getPort() + "]" + "에서 접속");
 
                // 서버에서 클라이언트로 메시지를 전송할 Thread 생성
                 ServerReceiver thread = new ServerReceiver(socket);
                 thread.start(); 

            }// while 

        } catch (Exception e) { 
        } 
        
    } // start() 

    // 서버 시작
    public static void main(String[] args) {
         new MultichatServer().start();
    } // main()
    
    // 서버에서 클라이언트로 메시지를 전송할 Thread 
    class ServerReceiver extends Thread {
           
    	Socket socket; 
        DataInputStream in; 
        DataOutputStream out; 
            

        ServerReceiver(Socket socket) { 
        	this.socket = socket; 
            try { 
                    // 클라이언트 소켓에서 데이터를 수신받기 위한 InputStream 생성
            	in = new DataInputStream(socket.getInputStream());
                      
                    // 클라이언트 소켓에서 데이터를 전송하기 위한 OutputStream 생성
                out = new DataOutputStream(socket.getOutputStream());
            } catch (IOException e) {
            	e.printStackTrace();
           	} 
        } 
            

        // 대화방에 있는 전체 유저에게 메시지 전송 
        void sendToAll(String msg) {
        	
            // 대화방에 접속한 유저의 대화명 리스트 추출 
        	Iterator<String> it = clients.keySet().iterator(); 

        	while (it.hasNext()) { 
        		try { 
        			String name = it.next(); 
        			DataOutputStream out = clients.get(name); 
        			out.writeUTF(msg); 
        		} catch (IOException e) { 
        		}
        		
        	} // while 
        	
        } // sendToAll 
            
        public void run() {
             String name = ""; 
            try { 
                // 서버에서는 최초에 클라이언트가 보낸 대화명을 받아야 한다. 
                 name = in.readUTF(); 
                 
                // 대화명을 받아, 전에 클라이언트에게 대화방 참여 메시지를 보낸다. 
                 sendToAll("#" + name + "님이 들어오셨습니다.");
 
                // 대화명, 클라이언로 메시지를 보낼 수 있는 OutputStream 객체를 대화방 Map에 저장
                clients.put(name, out); 
                System.out.println("현재 서버접속자 수는 " + clients.size() + "입니다.");
                  
                // 클라이언트가 전송한 메시지를 받아, 전에 클라이언트에게 메시지를 보낸다. 
                 while (in != null) { 
                    sendToAll(in.readUTF()); 
                    
                }//while  
                 
            } catch (IOException e) { 
            } finally { 
                // finally 실행된다는 것은 클라이언트가 빠져나간 것을 의미 
                 sendToAll("#" + name + "님이 나가셨습니다.");
                  
                // 대화방에서 객체 삭제 
                clients.remove(name); 
                System.out.println("[" + socket.getInetAddress() //
                         + ":" + socket.getPort() + "]" + "에서 접속을 종료하였습니다.");
                 System.out.println("현재 서버접속자 수는 " + clients.size() + "입니다.");
             } // try 
            
        } // run
            
    } // ReceiverThread
    
} // class 

