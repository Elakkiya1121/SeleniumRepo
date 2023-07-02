package week3.day1;

public class HDFCBank extends BankInfo {

	public void depositRate() {
		
		System.out.println("8%");
	}
	public static void main(String[] args) {
		HDFCBank obj=new HDFCBank();
		obj.savingAmount();
		obj.fixedAmount();
		obj.depositAmount();
		obj.depositRate();
	}
}
