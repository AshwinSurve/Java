package test;
import java.util.*;
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("a = "+a+" b = "+b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a = "+a+" b = "+b);
		sc.close();
	}

}
