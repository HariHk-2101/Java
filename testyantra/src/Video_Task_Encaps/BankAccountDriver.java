package Video_Task_Encaps;

public class BankAccountDriver {

	public static void main(String[] args) {
		
		BankAccount b1=new BankAccount();
		
		b1.setAccountNum(987654321l);
		b1.setBalance(23000);
		
		int bal=b1.getBalance();
		if(bal>=0&&bal<=500000) {
		System.out.println("BankAccountNum : "+b1.getAccountNum()+"\nBankBalance : "+bal);
	     }
		else
		{
			System.out.println("Bank Balance Is Invalid...");
		}
	}
}
