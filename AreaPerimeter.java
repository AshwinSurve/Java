import java.util.Scanner;

public class AreaPerimeter {
	static double Area,Perimeter;
	public static void area(int r) {
		Area = 3.142*(r*r);
		System.out.println("Area of a Circle ="+Area);
	}
	public static void perimeter(int r) {
		Perimeter = 3.142*(2*r);
		System.out.println("Perimeter Of the Circle ="+Perimeter);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int radius = sc.nextInt();
		area(radius);
		perimeter(radius);
	}

}
