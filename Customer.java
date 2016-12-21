import java.io.*;
class Customer implements Serializable{
	String account;
	String name;
	String password;
	double balance;
	boolean VIP;
	boolean signin;
	Customer()
	{
		this.balance=0;
		this.VIP=false;
		this.signin=false;
	}
	String getaccount(){
		return this.account;
	}
	Double getbalance(){
		return this.balance;
	}
	String getname(){
		return this.name;
	}
	void setpassword(String password){
		this.password=password;
	}
	void toVIP(){
		this.VIP=true;
	}
	void signin(){
		this.signin=true;
	}
	void addBalance(double banlance){
		double i;
		i=this.balance;
		this.balance=balance+i;
       }
	void consume(double money){
		this.balance=this.balance-money;
	}
}
		