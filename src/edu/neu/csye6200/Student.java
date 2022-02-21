package edu.neu.csye6200;
//import java.util.*;
//Student is a child/derived/base class and Parent is super/parent class of Student class
public class Student extends Person implements Comparable<Student>  {
	private double gpa;
	private int id;
	public Student(double gpa, int id,String lastName, int age) {
		super(lastName, age);
		this.gpa = gpa;
		this.id=id;
	}
	//Getters and Setters
	public int getId() { return id;}
	public void setId(int id) { this.id = id;}
	public double getGpa() { return gpa; }
	public void setGpa(double gpa) { this.gpa = gpa;}
	//Methods for sorting based on fields/data members
	public static int studentsIdCompare(Student student1, Student student2){
		 return Integer.compare(student1.getId(), student2.getId());      
    }
	public static int studentsAgeCompare(Student student1, Student student2){
		 return Integer.compare(student1.getAge(), student2.getAge());      
	 }
	 public static int studentsGPACompare(Student student1, Student student2){
		 return Double.compare(student1.getGpa(), student2.getGpa());      
	 }
	 public static int studentsLastNameCompare(Student student1, Student student2){
		return student1.getLastName().compareToIgnoreCase(student2.getLastName());      	
	 }
	 public static int personsLastNameCompare(Person student1, Person student2){
		return student1.getLastName().compareToIgnoreCase(student2.getLastName());      	
	 }
	 public static int personsAgeCompare(Person student1, Person student2){
		 Student student11 =(Student)student1;Student student22= (Student)student2;
		 return Integer.compare(student11.getAge(), student22.getAge());      
	 } 
	 public static int personsIDCompare(Person student1, Person student2){
		 Student student11 =(Student)student1; Student student22= (Student)student2;
		 return Integer.compare(student11.getId(), student22.getId());      
	 }
	 public static int personsGPACompare(Person student1, Person student2){
		 Student student11 =(Student)student1; Student student22= (Student)student2;
		 return Double.compare(student11.getGpa(), student22.getGpa());      
	 }
	
	@Override
	public String toString() {
		return "ID: "+id + " LastName: "+getLastName() + " GPA: "+gpa
				+" Age: " +getAge();
	}
	@Override //this is sorting base on natural order in this case
	//it is ID
	public int compareTo(Student i) {
		if (i.getId()<id) {
			return 1;
		} else if (id < i.getId())
			return -1;
		else
			return 0;
		
	}}
