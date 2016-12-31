package cn.com.Mike;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;



public class Server {
	
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			//����һ��������socket�����󶨼����˿�
			serverSocket = new ServerSocket(8626);
			System.out.println("************���������������ȴ��ͻ�������*************");
			Socket socket = null;
			//��¼�ͻ��˵�����
			int count = 0;
			//ѭ�������ͻ��˵�����
			while(true){
				//����accept�������м������ȴ��ͻ�������
				socket = serverSocket.accept();
				//����һ���̣߳�������ͻ��˵Ľ���
				SocketThread st = new SocketThread(socket);
				Thread thread = new Thread(st);
				thread.start();
				count++;
				System.out.println("��ǰ���ӵĿͻ�������Ϊ��"+count);
				
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