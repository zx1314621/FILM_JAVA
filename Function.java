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
	    System.out.println("�������˺�:");
	try {
		c1.account=br.readLine();
	    System.out.println("�������˻�����");
	    c1.password=br.readLine();
	    System.out.println("�������˻�����");
	    c1.name=br.readLine();
	    System.out.println("�Ƿ�������VIP��Ա���������Ǹ������ʵķ�����Ҫ����������yes");
	    str=br.readLine();
	    if(str.equals("yes"))
	    {
	    	if(c1.balance>=20)
	    	{
	    		c1.toVIP();
	    		System.out.println("�����ɹ�");
	    	}
	    	else {
	    		System.out.println("�˻������Ƿ�ǰȥ��ֵ(yes,no)");
	    		str=br.readLine();
	    		if(str.equals("yes"))
	    		{
	    			f.upbanlance(c1);
	    		    System.out.println("�Ƿ�������VIP��Ա���������Ǹ������ʵķ�����Ҫ����������yes");
	    	        str=br.readLine();
	    	        if(str.equals("yes"))
	    	      {
	    	    	if(c1.balance>=20)
	    	    	{
	    	    		c1.toVIP();
	    	    		System.out.println("�����ɹ�");
	    	    	}
	    	      }
	    	}
	    }
}
	    else System.out.println("");
	    customer.add(c1);
	    System.out.println("�����ϴ���Ϣ�����Ե�");
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("�ϴ�ʧ�ܣ����Ժ�����");
			e.printStackTrace();
		}
	    System.out.println("ע���ʻ��ɹ�!");
	    f.writeObjectToFile();
	    System.out.println("���ز˵�!");
	    s.menu();
	    
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("ע��ʧ��!");
		System.exit(-1);
	}
	} 
	public Customer signin() throws IOException{
		Customer c = null;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String account;
		String password;
		f.readObjectFromFile();
		System.out.println("�����������˺�");
		account=br.readLine();
		System.out.println("��������������");
		password=br.readLine();
		for(int i=0;i<customer.size();i++)
		{
			Customer test=customer.get(i) ;
			if(test.account.equals(account)&&test.password.equals(password))
			{
				System.out.println("��½�ɹ���");
				c=test;
				c.signin();
				f.printinformation(c);
				break;
			}
			else if(i==(customer.size()-1)) {System.out.println("��½ʧ�ܣ��������ڸ���Ϣ");}
			else continue;	
		}
		return c;
	}
	void query() throws IOException{
		Customer c=f.signin();
		if(c.signin){f.printinformation(c);}
		else System.out.println("û�е�¼!�����µ�¼");f.signin();
	}
	void printinformation(Customer c)
	{
		System.out.println("�˺�:"+c.account);
		System.out.println("�û�����"+c.name);
		System.out.println("�û����"+c.balance);
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
			    System.out.println("�õ�Ӱ��������"+film.name+"����Ϊ"+film.hall+"ʱ��Ϊ"+film.time);
				System.out.println("����ѡ�����λ");//ͼ�ν��棬�����ѡ��λ
				System.out.println("�������������Ӱ"+film.name+"��������Ҫ����Ʊ");//��GUIȷ����������»��number
				number=sc.nextInt();
				if(c.VIP){price=20*number*0.8;}
				else price=20*number;
				System.out.println("��Ʒ�ܼ۸���"+price+"ȷ������������yes!");
				str=br.readLine();
				if(str.equals("yes")){
					if(c.signin){c.consume(price);;System.out.println("����ɹ�!�˻����Ϊ"+c.balance);}//����Ժ���ô���˻���ĳ�����Ըı���ȷ�����Ƿ�����Ʊ
				}
			}else System.out.println("���ȵ�¼�˻�!");
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
		System.out.print("��������Ҫ��ֵ�Ľ��:");
		money=sc.nextInt();
		c.balance=c.balance+money;
		System.out.println("��ֵ�ɹ�!");
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