package cn.edu.usst.freedom;
import java.util.*;
public class Function {
	
	static  ArrayList<User> user=new  ArrayList<User>();
	static ArrayList<Film> film=new ArrayList<Film>();
	static Function f=new Function();
	String[]cinema=new String[10];
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
	/*Film getFilm(int j,String name)
	{
		Film test=new Film();
		int i=0;
		for(i=0;i<film.size();i++)
		{
			test=film.get(i);
			if(test.name.equals(name)){test.getPic(i);break;}
			else continue;
		}
		return test;
	}*/
	void oriFilm(){
		Film film0=new Film("�������",50,"pic0.jpg");
		Film film1=new Film("���涯��������",48,"pic1.jpg");
		Film film2=new Film("ʹͽ����",43,"pic2.jpg");
		Film film3=new Film("�ع����ж�",38,"pic3.jpg");
		Film film4=new Film("������è3",39,"pic4.jpg");
		Film film5=new Film("������",39,"pic5.jpg");
		film.add(film0);film.add(film1);film.add(film2);film.add(film3);film.add(film4);film.add(film5);
		cinema[0]="SFC�Ϻ�Ӱ��"
	}
	Film getFilm()
	{
		Film test;
		Ffilm f=new Ffilm();
		int i;
		i=f.backi();
		test=film.get(i);
		return test;
	}

	
}
