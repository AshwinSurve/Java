package Exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int a= 4;
		System.out.println(4/0);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
