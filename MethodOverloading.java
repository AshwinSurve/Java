
public class MethodOverloading {
	
	public static int area(int a) {
		return a*a;
	}
	public static int area(int a,int b) {
		return a*b;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("area of square = "+area(5));
		System.out.println("area of rectangle = "+area(5,10));
		

	}

}
