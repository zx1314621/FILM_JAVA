import java.io.IOException;
import java.util.Scanner;


public class Start {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Start s=new Start();
		s.menu();
	}
	void menu() throws IOException
	{
		Scanner sc=new Scanner(System.in);
		Function f=new Function();
		System.out.println("²Ëµ¥");
		System.out.println("1------------×¢²á");
		System.out.println("2------------µÇÂ¼");
		int i=sc.nextInt();
		switch(i){
		case 1:f.signup();break;
		case 2:f.signin();break;
		}
	}

}
