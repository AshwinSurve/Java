package Test;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int val;
		int balance = 1000;
		Deposit d = new Deposit();
	    Withdraw w = new Withdraw();
		while (true) {
			System.out.println("\n1: Deposit \n2: Withdraw \n3: exit\n");
			int op = sc.nextInt();	
			switch (op) {
				case 1:
					System.out.println("Enter amount to Deposit :-");
					d.setValue(val = sc.nextInt());
					System.out.println("Balance = "+(d.getBal(balance)));
					balance = d.getBal(balance);
					break;
				case 2:
					System.out.println("Enter amount to withdraw :-");
					w.setValue(val = sc.nextInt());
					System.out.println("Balance = "+(w.getValue(balance)));
					break;
				case 3:
					break;
				default:
					System.out.println("Choose from 1,2 & 3.");
					break;

			}
		}
	}

}
