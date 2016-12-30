package cn.edu.usst.freedom;

import java.io.Serializable;

public class User implements Serializable{
	public String username;
	public String  password;
	public String acount;
	public String telephone;
	public int balance;
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
}
