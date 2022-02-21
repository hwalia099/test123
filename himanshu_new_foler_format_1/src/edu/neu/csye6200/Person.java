package edu.neu.csye6200;
/*
 * Super class Person containing data members lastName, id, age 
 */
public class Person {
	private int age;
	//private int id;
	private String lastName;
	public Person(String lastName, int age) {
		this.lastName = lastName;
		//this.id = id;
		this.age = age;
	}
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "age=" + age + ", lastName=" + lastName + "]";
	}
}
