package cn.edu.usst.freedom;
import java.util.*;
public class Function {
	
	static  ArrayList<User> user=new  ArrayList<User>();
	static Function f=new Function();
   static User tran=new User();
	boolean signin(String account,String password){
		User test=new User();
		int i=0;
		boolean m=false;
		//String s = String.copyValueOf(password);
		for( i=0;i<user.size();i++)
		{
			test=user.get(i);
			if(account.equals(test.acount)&&password.equals(test.password))
			{
				m=true;
				tran=f.refer(test.acount);
			}
			else continue;
		}
		return m;
	}
	void save(String account,String password,String username,String telephone){
		User test=new User();
		test.setaccount(account);
		test.setpassword(password);
		test.setusername(username);
		test.setTelephone(telephone);
		user.add(test);
	}
	User refer(String account){
		int i;
		User test=new User();
		for( i=0;i<user.size();i++)
		{
			 test = user.get(i);
			 if(test.acount.equals(account)){
				 break;
			 }
		}
		return test;
	}
	User getUser()
	{
		return tran;
	}

	
}
