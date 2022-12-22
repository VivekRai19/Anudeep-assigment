package Person;

public class StudentMain {

	public static void main(String[] args) {
        //Declaring and initializing the array....
		String[] subjects= {"Java","OS","OOPS"};
		
        //Instantiation of students
		Student s1=new Student("Nvneet",20,"9065xxxx","11",subjects);
		Student s2=new Student("Kuttu",22,"9368xxxx","10",subjects);

//Printing the students details
		System.out.println(s1);
		System.out.println(s2);
		

	
	}

}