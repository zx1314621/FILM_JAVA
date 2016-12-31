package cn.com.Mike;

import java.io.Serializable;

public class User implements Serializable {
		String username;
		String  password;
		String acount;
		String telephone;
		void setusername(String name)
		{
			this.username=name;
		}
		void setpassword(String password)
		{
			this.password=password;
		}
		void setaccount(String account){
			this.acount=account;
		}
		void setTelephone(String telephone){
			this.telephone=telephone;
		}
	}



