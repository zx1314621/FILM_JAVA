package cn.com.Mike;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;



public class Server {
	
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			//创建一个服务器socket，并绑定监听端口
			serverSocket = new ServerSocket(8626);
			System.out.println("************服务器已启动，等待客户端连接*************");
			Socket socket = null;
			//记录客户端的数量
			int count = 0;
			//循环监听客户端的连接
			while(true){
				//调用accept方法进行监听，等待客户端连接
				socket = serverSocket.accept();
				//创建一个线程，处理与客户端的交互
				SocketThread st = new SocketThread(socket);
				Thread thread = new Thread(st);
				thread.start();
				count++;
				System.out.println("当前连接的客户端数量为："+count);
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}