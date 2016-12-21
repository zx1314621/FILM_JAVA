import java.io.*;
public class Film implements Serializable{
	static Function fun=new Function();
	int balance=4;
	String name;
	String address;
	String comments;
	double marks;
	boolean show=false;
	String hall;
	String seats;
	String time;
	int count;
	public Film(String name){
		this.name=name;
		double marks=0.0;
		this.show=true;
		this.count=0;
	}
	String getname(){
		return this.name;
	}
	String getcomments(){
		return this.comments;
	}
	Double getmarks(){
		return this.marks;
	}
	String gethall(){
		return this.hall;
	}
	String gettime(){
		return this.time;
	}
	void  addcomments(String comments){
		fun.add(comments);
	}
	void addmarks(double marks){
		this.marks=fun.average(this.marks,marks,count);
		this.count++;
	}
	
	
}
