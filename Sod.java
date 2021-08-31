import java.util.*;
public class Sod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n=0,sum=0;
		while(num>0) {
			n = num % 10;
			num = num / 10;
			sum = sum + n;
		}
		System.out.println("Sum of digits is = "+sum);

	}

}
