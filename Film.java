package cn.edu.usst.freedom;

import java.io.Serializable;

public class Film implements Serializable{
	String name;
	int price;
	public String filmreview;
	boolean[][] seats;
	int mark;
	int member;
	String pic;
	String brief;

	public Film(String name,int price,String pic,String brief){
		this.name=name;
		this.price=price;
		this.mark=mark;
		this.pic=pic;
		this.brief=brief;
		seats=new boolean[5][5];
		this.mark=50;
		this.member=0;
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				seats[i][j]=true;
			}
		}
	}
	public Film(){
		
	}
	void changemark(int mark){
		this.member++;
		this.mark=((this.mark*(this.member-1)+mark)/(this.member));
	}
	void changeSeats(int i,int j){
		this.seats[i][j]=false;
	}
	void resetSeats(int i,int j){
		this.seats[i][j]=true;
	}
	public void setfilmreview(String filmreview){
		this.filmreview=filmreview;
	}
	
	public  String getfilmreview(String filmreview){
		return filmreview;
	}
	
}

