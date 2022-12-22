package Bank;

//BankC is a class which implements the bank interface
public class BankC implements Bank {
	//Declaration...
		int rs;
		
		//Parameterized constructor of BankC
		public BankC(int rs) {
			this.rs=rs;
		}

		@Override
		public int getBalance() {
			return rs;
			
		}

}