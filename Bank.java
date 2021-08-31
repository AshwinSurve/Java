package Test;

class Bank {
	public void show() {
		System.out.println("Rate of interest:");
	}
}
class SBI extends Bank{
	public void show() {
		System.out.println("Rate of interest = 1%");
	}
	}

class BOI extends Bank{
	public void show() {
		System.out.println("Rate of interest = 2%");
	}
	public static void main(String args[]) {
		Bank b1,b2;
		b1 = new SBI();
		b2 = new BOI();
		b1.show();
		b2.show();
	}
}


