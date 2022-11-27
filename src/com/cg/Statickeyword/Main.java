package com.cg.Statickeyword;
class Students{
	private String name;
	private long mobile;
	private String email;
	private static String college="SIET";
	private float cgpa;
	
	public Students(String name, long mobile, String email,float cgpa) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.cgpa = cgpa;
	}
	static void change() {
		college="shri devi";
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCollege() {
		return college;
	}
	public float getCgpa() {
		return cgpa;
	}
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
public void display() {
	System.out.println(name +"  "+mobile+"  "+email+"  "+college+"  "+cgpa);
}
}
public class Main {
	public static void main(String[] args) {
		Students s1=new Students("thanu",4567,"thanu@gmail.com",8.9f);
		Students s2=new Students("anu",4567,"anu@gmail.com",8.7f);
		Students s3=new Students("kavya",4567,"kavya@gmail.com",8.6f);
		Students s4=new Students("sam",4567,"sam@gmail.com",8.5f);
		
		s1.display();
		s2.display();
		s3.display();
		s4.display();
	

	}

}
