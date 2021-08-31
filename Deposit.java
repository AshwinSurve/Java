package Test;

public class Deposit extends BankDB{
	int amount;
	public void setValue(int amt) {
		this.amount = amt;
	}
	public int getBal(int bal) {
		return bal + amount;
	}
}
