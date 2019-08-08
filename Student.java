package sesssion3;

import java.util.Scanner;

public class Student {
	private String name;
	private String phoneNumber;
	private int rollNumber;
	private String classLevel;
	
	Student() {
		
	}
	Student(String name,String phoneNumber,int rollNumber,String classLevel) {
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.rollNumber=rollNumber;
		this.classLevel=classLevel;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getClassLevel() {
		return classLevel;
	}
	public void setClassLevel(String classLevel) {
		this.classLevel = classLevel;
	}
	public static void main(String[] args) {
		Student testStudent=new Student();
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter your name :");
		testStudent.setName(scan.next());
		System.out.print("Enter your phone number:");
		testStudent.setPhoneNumber(scan.next());
		System.out.print("Enter your roll number:");
		testStudent.setRollNumber(scan.nextInt());
		System.out.print("Enter your class:");
		testStudent.setClassLevel(scan.next());
		System.out.print("Enter your Physics Marks:");
		int pGr=scan.nextInt();
		System.out.print("Enter your Chemistry Marks:");
		int cGr=scan.nextInt();
		System.out.print("Enter your Math Marks:");
		int mGr=scan.nextInt();
		StudentResultProcessing rez=new StudentResultProcessing(testStudent,pGr,cGr,mGr);
		
		System.out.println("Name:"+testStudent.getName());
		System.out.println("Phone Number:"+testStudent.getPhoneNumber());
		System.out.println("Roll Number:"+testStudent.getRollNumber());
		System.out.println("Class:"+testStudent.getClassLevel());
		System.out.println("Result:"+rez.result());
		scan.close();
	}
}
	

