package org.hillel.it.bereginya.model.entity;

import java.util.Date;

public class User {	
	private final String LOGIN;	
	private String password;
	private String name;
	private Sex sex;
	private Date birthday;
	private String email;
	
	public User(String lOGIN, String password, String name, Sex sex,
			Date birthday, String email) {
		super();
		LOGIN = lOGIN;
		this.password = password;
		this.name = name;
		this.sex = sex;
		this.birthday = birthday;
		this.email = email;
	}
	
	public String getLOGIN()    { return LOGIN;    }
	public String getName()     { return name;     }
	public String getPassword() { return password; }
	public Sex    getSex()      { return sex;	   }
	public Date   getBirthday() { return birthday; }
	public String getEmail()    { return email;	   }
	
	public void   editName(String name)          {  this.name     = name;      }
	public void   editSex(Sex sex)               {  this.sex      = sex;       }
	public void   editBirthday(Date birthday)    {  this.birthday = birthday;  }
	public void   editEmail(String email)        {  this.email    = email;     }
	
	public void   editPassword(String password)  {  this.password = password;  }
}
