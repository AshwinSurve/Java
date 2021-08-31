package Test;

public class Withdraw extends BankDB{
	int amount;
	public void setValue(int amt) {
		this.amount = amt;
	}
	public int getValue(int bal) {
		return bal - amount;
	}
}
