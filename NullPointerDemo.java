package Exception;

public class NullPointerDemo {
	public static void main(String args[]) {
		try {
		String s1=null;
		System.out.println(s1.length());
		}
		catch (NullPointerException e) {
			System.out.println("String is empty.");
		}
	}
}
