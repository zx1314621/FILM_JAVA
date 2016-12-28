package cn.edu.usst.freedom;

class Film {
	String name;
	double price;
	String[] comments;
	boolean[][] seats;
	int mark;
	int member;
	String pic;
	String brief;

	public Film(String name,double price,String pic,String brief){
		this.name=name;
		this.price=price;
		this.mark=mark;
		this.pic=pic;
		this.brief=brief;
		comments=new String[20];
		seats=new boolean[5][5];
		this.mark=50;
		this.member=0;
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				seats[i][j]=true;
			}
		}
	}
	void changemark(int mark){
		this.member++;
		this.mark=((this.mark*(this.member-1)+mark)/(this.member));
	}
}

