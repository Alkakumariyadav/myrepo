package com.tnsif.day3.day4.day5.C43_Java.copy;

public class Encapulation {
	String name;
	int age;
	String dept;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "OopsConceptDemo [Name=" + name + ", age=" + age + ", dept=" + dept + "]";
		
	}
	
	public static void main(String[] args) {
		Encapulation obj = new Encapulation();
		obj.setName("Alka");
		obj.setAge(22);
		obj.setDept("CSE");
		System.out.println(obj);
	}	
	

}
