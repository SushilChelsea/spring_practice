package business;

public class Bank {
	private int amount=5000;
	private String acno="sbi123";
	
	public int deposite(String acno, int amount) {
		if(this.acno.equals(acno)) {
			System.out.println("in deposite method");
			this.amount=this.amount+amount;
			return this.amount;
		} else {
			throw new AcnoNotFoundException();
		}
	}
	
	public int findBal(String acno) {
		if(acno.equals(this.acno)) 
			return this.amount;
		else 
			return 0;
	}
	
	
}
