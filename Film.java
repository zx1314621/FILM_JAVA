
public class Film {
	static Function fun=new Function();
	String name;
	String comments;
	double marks;
	boolean show=false;
	String hall;
	String seats;
	String time;
	public Film(){
		this.show=true;
	}
	String getname(){
		return this.name;
	}
	String getcomments(){
		return this.comments;
	}
	double getmarks(){
		return this.marks;
	}
	String gethall(){
		return this.hall;
	}
	String gettime(){
		return this.time;
	}
	String addcomments(String comments){
		this.comments=fun.add(comments);
	}
	Double addmarks(Double marks){
		this.marks=fun.average(marks);
	}
	
	
}
