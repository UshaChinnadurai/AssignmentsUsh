package week3Assignment3;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("9%");
	}
	public static void main(String[] args) {
		AxisBank bankoverride = new AxisBank();
		bankoverride.saving();
		bankoverride.fixed();
		bankoverride.deposit();
	}

}
