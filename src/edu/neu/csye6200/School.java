package edu.neu.csye6200;
import java.util.*;
public class School {
	private List<Student> studentRoster = new ArrayList<>();
	private List<Person> personRoster = new ArrayList<>();
	/*
	 * Below are the two methods to add students to student and
	 * person list
	 * 
	 */
    public void addStudentToPersonList(Student student) {
		personRoster.add(student);	
	}
	public void addStudentToStudentList(Student student) {
		studentRoster.add(student);
	}
	
	@Override
	public String toString() {
		System.out.println("**************************\n");
		System.out.println("***Persons****\n");
		for(Person k: personRoster) {
			System.out.println(" "+ k.toString());
		}
		System.out.println("\n***Students****\n");
		for(Student k: studentRoster) {
			System.out.println(" "+ k.toString());
		}
		return "\n**************************";
	}
	/*
	 * below are the two methods to sort student to both person
	 * and student list
	 */
	
	public void sortPersonsToPersonList(Comparator<Person> p) {
		personRoster.sort(p);
	}
	public void sortStudentsToStudentList(Comparator<Student> student) {
	studentRoster.sort(student);
    }
	public void demo() {
		School s = new School();
		//adding students to person list
		s.addStudentToPersonList(new Student(3.04, 7891, "Person2", 34));
		s.addStudentToPersonList(new Student(2.05, 8767, "Person1", 44));
		s.addStudentToPersonList(new Student(3.95, 8762, "Person5", 54));
		s.addStudentToPersonList(new Student(3.91, 1911, "Person4", 64));
		s.addStudentToPersonList(new Student(3.07, 9882, "Person3", 74));
	    //adding students to student list
		s.addStudentToStudentList(new Student(3.06, 8811, "Student5", 11));
		s.addStudentToStudentList(new Student(2.06, 1109, "Student2", 19));
		s.addStudentToStudentList(new Student(3.91, 2227, "Student1", 21));
		s.addStudentToStudentList(new Student(3.99, 2200, "Student4", 12));
		s.addStudentToStudentList(new Student(3.89, 3292, "Student3", 17));
		System.out.println("**************************");
		System.out.println("Initial Person and Student list");
        System.out.println(s);
		//Sorting based on ID
		System.out.println("Sorting  list by ID");
		//Using lambda function to invoke comparing methods
		Comparator<Student> student=(Student s1, Student s2)->Student.studentsIdCompare(s1,s2);
		s.sortStudentsToStudentList(student);
		s.sortPersonsToPersonList((Person s1, Person s2)->Student.personsIDCompare(s1,s2));
     	System.out.println(s);
		//Sorting based on Age
		System.out.println("Sorting  list by Age");
		s.sortStudentsToStudentList((Student s1, Student s2)->Student.studentsAgeCompare(s1,s2));
		s.sortPersonsToPersonList((Person s1, Person s2)->Student.personsAgeCompare(s1,s2));
		System.out.println(s);
		//sorting based on lastName
		System.out.println("Sorting  list by LastName");
		s.sortStudentsToStudentList((Student s1, Student s2)->Student.studentsLastNameCompare(s1,s2));
		s.sortPersonsToPersonList((Person s1, Person s2)->Student.personsLastNameCompare(s1,s2));
		System.out.println(s);
		//Sorting based on GPA
		System.out.println("Sorting  list by GPA");
		s.sortStudentsToStudentList((Student s1, Student s2)->Student.studentsGPACompare(s1,s2));
		s.sortPersonsToPersonList((Person s1, Person s2)->Student.personsGPACompare(s1,s2));
		System.out.println(s);
	}
}
