package com.kodnest.encapsulation;

public class DemoApp {
	public static void main(String[] args) {
		Student1 s=new Student1("aaarv",22);
		System.out.println(s.getName());
		System.out.println(s.getId());
	}

}
class Student1
{
	private String name;
	private int id;
	public Student1(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public int  getId()
	{
		return id;
	}
}
