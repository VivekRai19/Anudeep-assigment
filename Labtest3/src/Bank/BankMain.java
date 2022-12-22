package Bank;

public class BankMain {

	public static void main(String[] args) {
		//Instantiation and calling the parameterized constructor...
				BankA a=new BankA(1000);
				BankB b=new BankB(1500);
				BankC c=new BankC(2000);
				
				//printing and calling the getBalance method to check the balance in each bank..
				System.out.println("Amount in a Bank A :"+a.getBalance());
				System.out.println("Amount in a Bank B :"+b.getBalance());
				System.out.println("Amount in a Bank C :"+c.getBalance());
				
			

	}

}