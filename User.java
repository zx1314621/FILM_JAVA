package cn.edu.usst.freedom;

import java.io.Serializable;

public class User implements Serializable{
	public String username;
	public String  password;
	public String acount;
	public String telephone;
	public int balance;
	public int[] filmticket=new int[6];
	public void setusername(String name)
	{
		this.username=name;
	}
	public void setpassword(String password)
	{
		this.password=password;
	}
	void setaccount(String account){
		this.acount=account;
	}
	void setTelephone(String telephone){
		this.telephone=telephone;
	}
	public void addBalance(int money){
		this.balance=this.balance+money;
	}
	public void luckDraw(){
		this.balance=this.balance-10;
	}
	public void consume(int money){
		this.balance=this.balance-money;
	}
	public void addTicket(int number){
		Ffilm f=new Ffilm();
		int i;
		i=f.backi();
		this.filmticket[i]=this.filmticket[i]+number;
	}
	public String getTicket(){
		String str=" ";
		if(this.filmticket[0]!=0){str=str+"你的名字:"+this.filmticket[0];}
		if(this.filmticket[1]!=0){str=str+"神奇动物在哪里:"+this.filmticket[1];}
		if(this.filmticket[2]!=0){str=str+"使徒行者:"+this.filmticket[2];}
		if(this.filmticket[3]!=0){str=str+"湄公河行动:"+this.filmticket[3];}
		if(this.filmticket[4]!=0){str=str+"功夫熊猫3:"+this.filmticket[4];}
		if(this.filmticket[5]!=0){str=str+"疯狂动物城:"+this.filmticket[5];}
		return str;
	}
}
