package webspider;
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
	public String getonlinereviews_yourname() throws Exception{
		String str=" ";
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
			 str=str+"\n"+YN;
		 }
		 return str;
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
	//<使徒行者>
	public void getonlinereviews_ShiTu() throws Exception{
	      URL urlusstnews=new URL("https://movie.douban.com/subject/26336253/");

	      
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
				 String ST=m.group();
			        System.out.println(m.group());
			
			 }
		}





}
