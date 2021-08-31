package Exception;

public class ArrayDemo {
	public static void main(String args[]) {
		try{
			int a[] = new int [1];
			try{
				a[5] = 30/0;
			}
			catch(ArithmeticException e) {
				System.out.println("Division by Zero");
		}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index Out Of Bound.");
		}
	}
}
