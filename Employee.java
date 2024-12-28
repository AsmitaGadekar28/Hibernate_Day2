package com.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Employee {

	@Id
	private long PhoneNum;
	private String Emp_name;
	private int age;
	private String Address;
	
	public Employee()
	{
		
	}
	public Employee(long phoneNum, String emp_name, int age, String address) {
		super();
		PhoneNum = phoneNum;
		Emp_name = emp_name;
		this.age = age;
		Address = address;
	}

	public long getPhoneNum() {
		return PhoneNum;
	}

	public void setPhoneNum(long phoneNum) {
		PhoneNum = phoneNum;
	}

	public String getEmp_name() {
		return Emp_name;
	}

	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Employee [PhoneNum=" + PhoneNum + ", Emp_name=" + Emp_name + ", age=" + age + ", Address=" + Address
				+ "]";
	}
	
}
