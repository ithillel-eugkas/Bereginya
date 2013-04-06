package org.hillel.it.bereginya.model.entity;

import java.util.Date;

public class User {	
	private final String LOGIN;	
	private String password;
	private String name;
	private Sex sex;
	private Date birthday;
	private String email;
	private String phone;
	
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
	
	public User(String lOGIN, String password, String name, Sex sex,
			Date birthday, String email, String phone) {
		LOGIN = lOGIN;
		this.password = password;
		this.name = name;
		this.sex = sex;
		this.birthday = birthday;
		this.email = email;
		this.phone = phone;
	}
	
	public String getLOGIN()    { return LOGIN;    }
	public String getName()     { return name;     }
	public Date   getBirthday() { return birthday; }
	public String getEmail()    { return email;	   }
	
	public void   editName(String newName)          {  this.name     = newName;      }
	public void   editSex(Sex newSex)               {  this.sex      = newSex;       }
	public void   editBirthday(Date newBirthday)    {  this.birthday = newBirthday;  }
	public void   editEmail(String newEmail)        {  this.email    = newEmail;     }
	public void   editPhone(String newPhone)        {  this.phone    = newPhone;     }
	
	public String getPhone() {
		if(phone != null) 
			return phone;
		return null;
	}
	
	public boolean verification(String checkPassword) {
		if (this.password.equals(checkPassword)) 
			return true;
		return false;
	}
	
	public void   editPassword(String oldPassword, 
							   String newPassword, String confirmPassword)  {		
		if(newPassword.equals(confirmPassword)) {
			if(this.password.equals(oldPassword)) {
				this.password = newPassword;
			}
			else {
				System.out.println("Ошибка ввода пароля");
			}		
		}
		else {
			System.out.println("Ошибка подтверждения пароля");
		}
	}
	
	public void viewPersonalInfo() {}
}
