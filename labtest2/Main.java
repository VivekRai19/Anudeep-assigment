package labtest2;

//this class is created to call the main function and make instances of all the classes declared according to the use 
public class Main {

	public static void main(String[] args) {
		Address add = new Address(23, "Gamma 2", "Noida");
		Address add1 = new Address(25, "Zeta 1", "Noida");
		Employees em = new Employees("Vivek", 21, "7084xxxx", add, "40,000", "Web Devlopment", "Technical");
		Manager man = new Manager("Rahul", 34, "989XXXX", add1, "60,000", "Human Resources", "HR");
		
		em.print();
		System.out.println();
		man.print();
		
	}

}