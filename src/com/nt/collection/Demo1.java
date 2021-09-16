package com.nt.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		List<Student> stud= new ArrayList<>();
		stud.add(new Student(1,55));
		stud.add(new Student(2,45));
		stud.add(new Student(3,65));
		stud.add(new Student(4,85));
		stud.add(new Student(5,48));
		stud.add(new Student(6,79));
		stud.add(new Student(7,71));
		//comperator
//		Comparator<Student> com=(s1,s2) ->{
//			if(s1.mark>s2.mark)
//				return 1;
//			
//				return -1;
//			
//		};
		Collections.sort(stud,(s1,s2) ->{//using lemda expraction
			return s1.mark>s2.mark?1:s1.mark<s2.mark?-1:0;
		});	
		
//		for(Student s : stud)
//		{
//			System.out.println(s);
//		}
	stud.forEach(System.out::println);	// in string api using lemda expraction
	}

}
class Student
{
	int rollno;
	int mark;
	public Student(int rollno, int mark) {
		this.mark=mark;
		this.rollno=rollno;
	}
	@Override
	public String toString() {
		
		return "Student{" +"rollno=" + rollno + "Marks Obtain=" + mark + '}';
	}
	
	}
	

