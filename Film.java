package cn.edu.usst.freedom;

class Film {
	String name;
	double price;
	String[] comments;
	boolean[][] seats;
	int mark;
	int member;
	String pic;

	public Film(String name,double price,String pic){
		this.name=name;
		this.price=price;
		this.mark=mark;
		this.pic=pic;
		comments=new String[20];
		seats=new boolean[10][10];
		this.mark=50;
		this.member=0;
	}
	void changemark(int mark){
		this.member++;
		this.mark=((this.mark*(this.member-1)+mark)/(this.member));
	}
}

