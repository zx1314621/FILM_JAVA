package cn.com.Mike;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class OnlineReview {
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Filmreviewonline fro=new Filmreviewonline();
		Scanner sc = new Scanner(System.in); 
		
		int choice = sc.nextInt();
		switch(choice){
		case 1:{
			System.out.println("《你的名字》的影评———来自豆瓣网");
			fro.getonlinereviews_yourname();
			break;
		 }
		case 2:{
			System.out.println("《神奇动物在哪里》的影评———来自豆瓣网");
			fro.getonlinereviews_horrypotter2016();
			break;
		 }
		case 3:{
			System.out.println("《疯狂动物城》的影评———来自豆瓣网");
			fro.getonlinereviews_Zootopia();
			break;
		 }
		case 4:{
			System.out.println("《功夫熊猫》的影评———来自豆瓣网");
			fro.getonlinereviews_KungFuPanda();
			break;
		 }
		case 5:{
			System.out.println("《湄公河行动》的影评———来自豆瓣网");
			fro.getonlinereviews_MeiGongHe();
			break;
		 }
		case 6:{
			System.out.println("《大鱼海棠》的影评———来自豆瓣网");
		    fro.getonlinereviews_DaHai();
		    break;
		 }
		
	  }
		
		
		
	 }
}


class Filmreviewonline{
	//通过爬虫获得网上的影评
	//<你的名字>
	public void getonlinereviews_yourname() throws Exception{
      URL urlusstnews=new URL("https://movie.douban.com/subject/26683290/?from=showing");

      
		BufferedReader in=new BufferedReader(new InputStreamReader(urlusstnews.openStream()));
		String s = null,input;
		while ((input=in.readLine())!=null)
			s=s+input;
		
		in.close();
	
		String reg = "</h3>(.+?)</p>";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(s);
		 for (int i=0;i<3;i++){
			 m.find();
			 String YN=m.group();
		        System.out.println(m.group());
		
		 }
	}

  //<神奇动物在哪里>
	public void getonlinereviews_horrypotter2016() throws Exception{
	      URL urlusstnews=new URL("https://movie.douban.com/subject/25726614/");

	      
			BufferedReader in=new BufferedReader(new InputStreamReader(urlusstnews.openStream()));
			String s = null,input;
			while ((input=in.readLine())!=null)
				s=s+input;
			
			in.close();
		
			String reg = "</h3>(.+?)</p>";
			
			Pattern p = Pattern.compile(reg);
			Matcher m = p.matcher(s);
			 for (int i=0;i<3;i++){
				    m.find();
				    String HR=m.group();
			        System.out.println(m.group());
	                
          }
	}
	//<疯狂动物城>
	public void getonlinereviews_Zootopia() throws Exception{
	      URL urlusstnews=new URL("https://movie.douban.com/subject/26683290/?from=showing");

	      
			BufferedReader in=new BufferedReader(new InputStreamReader(urlusstnews.openStream()));
			String s = null,input;
			while ((input=in.readLine())!=null)
				s=s+input;
			
			in.close();
		
			String reg = "</h3>(.+?)</p>";
			
			Pattern p = Pattern.compile(reg);
			Matcher m = p.matcher(s);
			 for (int i=0;i<3;i++){
				 m.find();
				 String ZT=m.group();
			        System.out.println(m.group());
			
			 }
		}
	
	//<功夫熊猫>
	public void getonlinereviews_KungFuPanda() throws Exception{
	      URL urlusstnews=new URL("https://movie.douban.com/subject/1783457/");

	      
			BufferedReader in=new BufferedReader(new InputStreamReader(urlusstnews.openStream()));
			String s = null,input;
			while ((input=in.readLine())!=null)
				s=s+input;
			
			in.close();
		
			String reg = "</h3>(.+?)</p>";
			
			Pattern p = Pattern.compile(reg);
			Matcher m = p.matcher(s);
			 for (int i=0;i<3;i++){
				 m.find();
				 String KF=m.group();
			        System.out.println(m.group());
			
			 }
		}
	//<湄公河行动>
	public void getonlinereviews_MeiGongHe() throws Exception{
	      URL urlusstnews=new URL("https://movie.douban.com/subject/25815034/");

	      
			BufferedReader in=new BufferedReader(new InputStreamReader(urlusstnews.openStream()));
			String s = null,input;
			while ((input=in.readLine())!=null)
				s=s+input;
			
			in.close();
		
			String reg = "</h3>(.+?)</p>";
			
			Pattern p = Pattern.compile(reg);
			Matcher m = p.matcher(s);
			 for (int i=0;i<3;i++){
				 m.find();
				 String MGH=m.group();
			        System.out.println(m.group());
			
			 }
		}
	//<大鱼海棠>
	public void getonlinereviews_DaHai() throws Exception{
	      URL urlusstnews=new URL("https://movie.douban.com/subject/5045678/");

	      
			BufferedReader in=new BufferedReader(new InputStreamReader(urlusstnews.openStream()));
			String s = null,input;
			while ((input=in.readLine())!=null)
				s=s+input;
			
			in.close();
		
			String reg = "</h3>(.+?)</p>";
			
			Pattern p = Pattern.compile(reg);
			Matcher m = p.matcher(s);
			 for (int i=0;i<3;i++){
				 m.find();
				 String DH=m.group();
			        System.out.println(m.group());
			
			 }
		}





}
	
