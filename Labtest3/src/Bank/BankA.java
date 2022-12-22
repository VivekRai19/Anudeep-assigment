package Bank;

//BankA implements the Bank interface
public class BankA implements Bank {
	//Declaration...
		int rs;
		
		//Parameterized constructor of BankA
		public BankA(int rs) {
			this.rs=rs;
		}

		@Override
		public int getBalance() {
			return rs;
			
			
		}


}