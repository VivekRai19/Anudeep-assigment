package Person;

public class person {
	//data members declaration
	String name;
	String mob;
	int age;
	 
	//Default Constructor
		public person(){
			System.out.println("Default Constructor.....");	
		}
	//parameterized constructor	
	person(String name,int age,String mob){
		this.name = name;
		this.age = age;
		this.mob = mob;
		
	}
}