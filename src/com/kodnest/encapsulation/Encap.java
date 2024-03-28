package com.kodnest.encapsulation;
import java.util.Scanner;
public class Encap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student student=new Student();
		student.setName(sc.nextLine());
		student.setAge(sc.nextInt());
		System.out.println(student.getName());
		System.out.println(student.getAge());
		}
}
