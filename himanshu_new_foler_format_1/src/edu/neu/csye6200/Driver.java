package edu.neu.csye6200;
public class Driver {
	public static void main(String[] args) {
		School s = new School();
		s.demo(); //Calling the demo method of School.java
	}
}
/* -------------OUTPUT----------
 * 
**************************
Initial Person and Student list
**************************

***Persons****

 ID: 7891 LastName: Person2 GPA: 3.04 Age: 34
 ID: 8767 LastName: Person1 GPA: 2.05 Age: 44
 ID: 8762 LastName: Person5 GPA: 3.95 Age: 54
 ID: 1911 LastName: Person4 GPA: 3.91 Age: 64
 ID: 9882 LastName: Person3 GPA: 3.07 Age: 74

***Students****

 ID: 8811 LastName: Student5 GPA: 3.06 Age: 11
 ID: 1109 LastName: Student2 GPA: 2.06 Age: 19
 ID: 2227 LastName: Student1 GPA: 3.91 Age: 21
 ID: 2200 LastName: Student4 GPA: 3.99 Age: 12
 ID: 3292 LastName: Student3 GPA: 3.89 Age: 17

**************************
Sorting  list by ID
**************************

***Persons****

 ID: 1911 LastName: Person4 GPA: 3.91 Age: 64
 ID: 7891 LastName: Person2 GPA: 3.04 Age: 34
 ID: 8762 LastName: Person5 GPA: 3.95 Age: 54
 ID: 8767 LastName: Person1 GPA: 2.05 Age: 44
 ID: 9882 LastName: Person3 GPA: 3.07 Age: 74

***Students****

 ID: 1109 LastName: Student2 GPA: 2.06 Age: 19
 ID: 2200 LastName: Student4 GPA: 3.99 Age: 12
 ID: 2227 LastName: Student1 GPA: 3.91 Age: 21
 ID: 3292 LastName: Student3 GPA: 3.89 Age: 17
 ID: 8811 LastName: Student5 GPA: 3.06 Age: 11

**************************
Sorting  list by Age
**************************

***Persons****

 ID: 7891 LastName: Person2 GPA: 3.04 Age: 34
 ID: 8767 LastName: Person1 GPA: 2.05 Age: 44
 ID: 8762 LastName: Person5 GPA: 3.95 Age: 54
 ID: 1911 LastName: Person4 GPA: 3.91 Age: 64
 ID: 9882 LastName: Person3 GPA: 3.07 Age: 74

***Students****

 ID: 8811 LastName: Student5 GPA: 3.06 Age: 11
 ID: 2200 LastName: Student4 GPA: 3.99 Age: 12
 ID: 3292 LastName: Student3 GPA: 3.89 Age: 17
 ID: 1109 LastName: Student2 GPA: 2.06 Age: 19
 ID: 2227 LastName: Student1 GPA: 3.91 Age: 21

**************************
Sorting  list by LastName
**************************

***Persons****

 ID: 8767 LastName: Person1 GPA: 2.05 Age: 44
 ID: 7891 LastName: Person2 GPA: 3.04 Age: 34
 ID: 9882 LastName: Person3 GPA: 3.07 Age: 74
 ID: 1911 LastName: Person4 GPA: 3.91 Age: 64
 ID: 8762 LastName: Person5 GPA: 3.95 Age: 54

***Students****

 ID: 2227 LastName: Student1 GPA: 3.91 Age: 21
 ID: 1109 LastName: Student2 GPA: 2.06 Age: 19
 ID: 3292 LastName: Student3 GPA: 3.89 Age: 17
 ID: 2200 LastName: Student4 GPA: 3.99 Age: 12
 ID: 8811 LastName: Student5 GPA: 3.06 Age: 11

**************************
Sorting  list by GPA
**************************

***Persons****

 ID: 8767 LastName: Person1 GPA: 2.05 Age: 44
 ID: 7891 LastName: Person2 GPA: 3.04 Age: 34
 ID: 9882 LastName: Person3 GPA: 3.07 Age: 74
 ID: 1911 LastName: Person4 GPA: 3.91 Age: 64
 ID: 8762 LastName: Person5 GPA: 3.95 Age: 54

***Students****

 ID: 1109 LastName: Student2 GPA: 2.06 Age: 19
 ID: 8811 LastName: Student5 GPA: 3.06 Age: 11
 ID: 3292 LastName: Student3 GPA: 3.89 Age: 17
 ID: 2227 LastName: Student1 GPA: 3.91 Age: 21
 ID: 2200 LastName: Student4 GPA: 3.99 Age: 12

**************************

*/
