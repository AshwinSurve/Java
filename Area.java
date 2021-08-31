package test;

public class Area extends Shape{
	public Area(int length,int breadth,int radius,int side) {
		super(length,breadth,radius,side);
	}
	public void show() {
		System.out.println("Area of the rectangle = "+super.areaRect(length, breadth));
		System.out.println("Area of the Circle = "+super.areaCir(radius));
		System.out.println("Area of the Square = "+super.areaSqr(side));
	}
}
