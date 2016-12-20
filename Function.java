import java.io.*;
import java.util.*;
public class Function {
	static ArrayList<Customer> customer=new ArrayList<Customer>();
	Customer signup(){
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
	    System.out.println("注册帐户成功");
	    c1.signin();
	    br.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("注册失败!");
		System.exit(-1);
	}
	return c1;
	} 
	public Customer signin() throws IOException{
		Customer c = null;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String account;
		String password;
		System.out.println("请输入您的账号");
		account=br.readLine();
		System.out.println("请输入您的密码");
		password=br.readLine();
		for(int i=0;i<customer.size();i++)
		{
			Customer test=customer.get(i) ;
			if(test.account.equals(account)&&test.password.equals(password))
			{
				System.out.println("登陆成功！");
				c=test;
				c.signin();
				break;
			}
			else if(i==(customer.size()-1)) {System.out.println("登陆失败！，不存在该信息");}
			else continue;	
		}
		br.close();	
		return c;
	}
	void query() throws IOException{
		Function f=new Function();
		Customer c1=f.signup();
		Customer c2=f.signin();
		if(c1.signin){f.printinformation(c1);}
		else if(c2.signin){f.printinformation(c2);}
		else System.out.println("没有登录!请重新登录");f.signin();
	}
	void printinformation(Customer c)
	{
		System.out.println("账号:"+c.account);
		System.out.println("用户姓名"+c.name);
		System.out.println("用户余额"+c.balance);
	}
	void buytickets(Film film) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str;
		Function f=new Function();
		Customer c1=f.signup();
		Customer c2=f.signin();
		if(c1.signin){
			if(c1.VIP){
				System.out.println("您是尊贵的VIP会员，您将享受全场八折优惠!");
				System.out.println("请挑选你的座位");
				System.out.println("现在您将购买电影"+film.name+"将扣费16元");
				System.out.println("确定购买请输入yes!");
				str=br.readLine();
				if(str.equals("yes")){
					c1.balance=c1.balance-18;//买过以后怎么让账户的某个属性改变来确定他是否买了票
				}
			}
		}
		if(c2.signin){
			
		}
	}
}