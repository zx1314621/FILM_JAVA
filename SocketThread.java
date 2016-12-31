package cn.com.Mike;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;



public class SocketThread implements Runnable {
	private Socket socket = null ;
	private ObjectInputStream ois = null;
	private ObjectOutputStream oos = null;
	static ArrayList<User> customer=new ArrayList<User>();
	
	
	
	public SocketThread(Socket socket) {
		this.socket = socket;

	}

	@Override
	public void run() {
		try {
			
			OutputStream os = socket.getOutputStream();
			oos = new ObjectOutputStream(os);
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("customer.dat")));
			oos.writeObject(oos);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
	
	