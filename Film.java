package cn.edu.usst.freedom;

import java.io.Serializable;

public class Film implements Serializable{
	String name;
	int price;
	public String filmreview;
	boolean[][] seat1s;
	boolean[][] seat2s;
	boolean[][] seat3s;
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
		seat1s=new boolean[5][5];
		seat2s=new boolean[5][5];
		seat3s=new boolean[5][5];
		this.mark=50;
		this.member=0;
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				seat1s[i][j]=true;
				seat2s[i][j]=true;
				seat3s[i][j]=true;
			}
		}
	}
	public Film(){
		
	}
	void changemark(int mark){
		this.member++;
		this.mark=((this.mark*(this.member-1)+mark)/(this.member));
	}
	void changeSeat1s(int i,int j){
		this.seat1s[i][j]=false;
	}
	void changeSeat2s(int i,int j){
		this.seat2s[i][j]=false;
	}
	void changeSeat3s(int i,int j){
		this.seat3s[i][j]=false;
	}
	void resetSeat1s(int i,int j){
		this.seat1s[i][j]=true;
	}
	void resetSeat2s(int i,int j){
		this.seat2s[i][j]=true;
	}
	void resetSeat3s(int i,int j){
		this.seat3s[i][j]=true;
	}
	public void setfilmreview(String filmreview){
		this.filmreview=filmreview;
	}
	
	public  String getfilmreview(String filmreview){
		return filmreview;
	}
	
}

