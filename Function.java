import java.io.*;
import java.util.*;
public class Function {
	static ArrayList<Customer> customer=new ArrayList<Customer>();
	Customer signup(){
	Customer c1=new Customer();
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("�������˺�:");
	try {
		c1.account=br.readLine();
	    System.out.println("�������˻�����");
	    c1.password=br.readLine();
	    System.out.println("�������˻�����");
	    c1.name=br.readLine();
	    System.out.println("�Ƿ�������VIP��Ա���������Ǹ������ʵķ�����Ҫ����������yes");
	    String str=br.readLine();
	    if(str.equals("yes"))
	    {
	    	if(c1.balance>=20)
	    	{
	    		c1.toVIP();
	    		System.out.println("�����ɹ�");
	    	}
	    	else System.out.println("�˻��������ȳ�ֵ");
	    }
	    else System.out.println("");
	    customer.add(c1);
	    System.out.println("ע���ʻ��ɹ�");
	    c1.signin();
	    br.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("ע��ʧ��!");
		System.exit(-1);
	}
	return c1;
	} 
	public Customer signin() throws IOException{
		Customer c = null;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String account;
		String password;
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
				break;
			}
			else if(i==(customer.size()-1)) {System.out.println("��½ʧ�ܣ��������ڸ���Ϣ");}
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
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str;
		Function f=new Function();
		Customer c1=f.signup();
		Customer c2=f.signin();
		if(c1.signin){
			if(c1.VIP){
				System.out.println("��������VIP��Ա����������ȫ�������Ż�!");
				System.out.println("����ѡ�����λ");
				System.out.println("�������������Ӱ"+film.name+"���۷�16Ԫ");
				System.out.println("ȷ������������yes!");
				str=br.readLine();
				if(str.equals("yes")){
					c1.balance=c1.balance-18;//����Ժ���ô���˻���ĳ�����Ըı���ȷ�����Ƿ�����Ʊ
				}
			}
		}
		if(c2.signin){
			
		}
	}
}