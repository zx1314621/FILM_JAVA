
class Customer {
	String account;
	String name;
	String password;
	double balance=0;
	boolean VIP=false;
	boolean login=false; 
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
	void addBalance(double banlance){
		double i;
		i=this.balance;
		this.balance=balance+i;
	}
}
/*电影自助卖票系统
1图形界面设计GUI
2电影资讯传输设计
3.功能设计
电影类的属性.a电影名b影评c用户评分d是否上映（布尔）e.影厅f.座位g时间
电影类的方法.返回各种属性的方法。增加影评，增加用户评分到存储数组里的方法。
修改影厅座位时间的方法。
顾客类的属性.账号，姓名，密码，余额，VIP（默认为false）。
VIP类继承*/
