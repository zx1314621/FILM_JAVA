package cn.com.Mike;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;



public class Client {
	static ArrayList<User> customer=new ArrayList<User>();
	public static void main(String args[]){
		User e1=new User();
		e1.username="abc";
		e1.password="123456";
		e1.acount="cd123456";
		e1.telephone="10086";
		
		customer.add(e1);
		
		
			try {
				Socket socket=new Socket("127.0.0.1",8626);
				ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream()); 
				ObjectInputStream in = new ObjectInputStream(socket.getInputStream());  
				out.writeObject(e1);
				out.flush();
				out.close();
				in.close();
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	
		
	

}
}
