package Person;

import java.util.Arrays;

public class Student extends person {
	static final String institute="UCER";
	String roll;
	String[] subjects;
	
	//default constructor
	 public Student(){
		System.out.println("default constructor");
	}
	
	 //parameterized constructor
	 public Student(String name,int age,String mob,String roll,String[] subjects){
		 super(name,age,mob);
			this.roll = roll;
			this.subjects=subjects;
		} 
	
	//override toString
	 public String toString() {
			System.out.println("Institute: "+institute);
			return "Student [RollNo=" + roll + ", Subject=" + Arrays.toString(subjects) + ", Name=" + name + ", Age=" + age
					+ ", Mob=" + mob + "]";
		}
}