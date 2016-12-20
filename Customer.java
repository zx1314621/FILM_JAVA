
class Customer {
	String account;
	String name;
	String password;
	double balance=0;
	boolean VIP=false;
	boolean signin=false;
	String getaccount(){
		return this.account;
	}
	double getbalance(){
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
}
	