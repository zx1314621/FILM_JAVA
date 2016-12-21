import java.io.*;
import java.util.*;
public class Function {
	static ArrayList<Customer> customer=new ArrayList<Customer>();
	static ArrayList<String> comment=new ArrayList<String>();
	static Function f=new Function();
	static Start s=new Start();
	void signup()
	{
	    Customer c1=new Customer();
	    String str;
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("请输入账号:");
	try {
		c1.account=br.readLine();
	    System.out.println("请输入账户密码");
	    c1.password=br.readLine();
	    System.out.println("请输入账户姓名");
	    c1.name=br.readLine();
	    System.out.println("是否升级成VIP会员以享受我们更多优质的服务。若要升级请输入yes");
	    str=br.readLine();
	    if(str.equals("yes"))
	    {
	    	if(c1.balance>=20)
	    	{
	    		c1.toVIP();
	    		System.out.println("升级成功");
	    	}
	    	else {
	    		System.out.println("账户余额不足是否前去充值(yes,no)");
	    		str=br.readLine();
	    		if(str.equals("yes"))
	    		{
	    			f.upbanlance(c1);
	    		    System.out.println("是否升级成VIP会员以享受我们更多优质的服务。若要升级请输入yes");
	    	        str=br.readLine();
	    	        if(str.equals("yes"))
	    	      {
	    	    	if(c1.balance>=20)
	    	    	{
	    	    		c1.toVIP();
	    	    		System.out.println("升级成功");
	    	    	}
	    	      }
	    	}
	    }
}
	    else System.out.println("");
	    customer.add(c1);
	    System.out.println("正在上传信息，请稍等");
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("上传失败，请稍后重试");
			e.printStackTrace();
		}
	    System.out.println("注册帐户成功!");
	    f.writeObjectToFile();
	    System.out.println("返回菜单!");
	    s.menu();
	    
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("注册失败!");
		System.exit(-1);
	}
	} 
	public Customer signin() throws IOException{
		Customer c = null;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String account;
		String password;
		f.readObjectFromFile();
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
				f.printinformation(c);
				break;
			}
			else if(i==(customer.size()-1)) {System.out.println("登陆失败！，不存在该信息");}
			else continue;	
		}
		return c;
	}
	void query() throws IOException{
		Customer c=f.signin();
		if(c.signin){f.printinformation(c);}
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
		int number=0;
		double price=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		String str;
		Customer c=f.signin();
		if(c.signin){
			    System.out.println("该电影的名字是"+film.name+"大厅为"+film.hall+"时间为"+film.time);
				System.out.println("请挑选你的座位");//图形界面，点击挑选座位
				System.out.println("现在您将购买电影"+film.name+"请问您需要买几张票");//用GUI确定他点击几下获得number
				number=sc.nextInt();
				if(c.VIP){price=20*number*0.8;}
				else price=20*number;
				System.out.println("商品总价格是"+price+"确定购买请输入yes!");
				str=br.readLine();
				if(str.equals("yes")){
					if(c.signin){c.consume(price);;System.out.println("购买成功!账户余额为"+c.balance);}//买过以后怎么让账户的某个属性改变来确定他是否买了票
				}
			}else System.out.println("请先登录账户!");
	}
	void add(String comments)
   {
		comment.add(comments);
	}
	double average(double a, double b,int count) {
		a=(a*count+b)/(count+1);
	    return a;
	}
	void upbanlance(Customer c){
		int money;
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入您要充值的金额:");
		money=sc.nextInt();
		c.balance=c.balance+money;
		System.out.println("充值成功!");
	}
	void writeObjectToFile()
	{
		File file=new File("customer.dat");
		FileOutputStream out;
		try{
			out=new FileOutputStream(file,false);
			ObjectOutputStream objOut=new ObjectOutputStream(out);
			objOut.writeObject(customer);
			objOut.flush();
			objOut.close();
			System.out.println("write customer success!");
		   }catch(IOException e){
			   System.out.println("write customer failed");
			   e.printStackTrace();
		   }
		
	}
	void readObjectFromFile()
	{
		File file=new File("customer.dat");
		FileInputStream in;	
		Customer c=new Customer();
		try {
			in=new FileInputStream(file);
		     ObjectInputStream objIn;
		     objIn = new ObjectInputStream(in);
		     ArrayList list=(ArrayList<Customer>) objIn.readObject();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("read customer failed");
			e.printStackTrace();
		}
}
}