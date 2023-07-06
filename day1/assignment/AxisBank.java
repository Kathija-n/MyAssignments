package week3.assignment;

public class AxisBank extends BankInfo {

	public void deposit(){		
		System.out.println("Amount in saving account deposited to current account ");
}
	
	public static void main(String[] args) {
		AxisBank ziz = new AxisBank();
		ziz.saving();
		ziz.fixed();
		ziz.deposit();

	}

}
