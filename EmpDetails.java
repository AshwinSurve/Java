package test;
import java.util.*;
public class EmpDetails {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double sal = sc.nextDouble();
		if(sal <= 50000) {
			System.out.println("No Need to pay the Tax.");
		}
		else if(sal > 50000 && sal <= 60000){
			System.out.println("Tax to be paid = "+(sal/100)*10);
		}
		else if(sal > 60000 && sal <= 150000) {
			System.out.println("Tax to be paid = "+(sal/100)*20);
		}
		else {
			System.out.println("Tax to be paid = "+(sal/100)*30);
		}
	}
}
