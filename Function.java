import java.io.*;
import java.util.*;
public class Function {
	static ArrayList<Customer> customer=new ArrayList<Customer>();
	void create(){
	Customer c1=new Customer();
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("请输入账号:");
	try {
		c1.account=br.readLine();
	    System.out.println("请输入账户密码");
	    c1.password=br.readLine();
	    System.out.println("请输入账户姓名");
	    c1.name=br.readLine();
	    System.out.println("是否升级成VIP会员以享受我们更多优质的服务。若要升级请输入yes");
	    String str=br.readLine();
	    if(str.equals("yes"))
	    {
	    	if(c1.balance>=20)
	    	{
	    		c1.toVIP();
	    		System.out.println("升级成功");
	    	}
	    	else System.out.println("账户余额不足请先充值");
	    }
	    else System.out.println("");
	    customer.add(c1);
	    System.out.println("创建帐户成功");
	    menu();
	    br.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("输入失败!");
		System.exit(-1);
	}
	}
	public void menu() {
		// TODO Auto-generated method stub
		
	}
	public void log() throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String account;
		String password;
		System.out.println("请输入您的账号");
		account=br.readLine();
		System.out.println("请输入您的密码");
		password=br.readLine();
		for(int i=0;i<customer.size();i++){
			while(account.equal())
		}
	}
}