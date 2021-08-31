package IntefacePkg;

public class InterfaceDemo implements Shape {
	public void calRectArea() {
		System.out.println("Area of Rect = "+(length*breadth));
	}
	 public void calSqArea() {
		 System.out.println("Area Of Square = "+(side*side));
	 }
	 public void calCirArea() {
		 System.out.println("Area of Circle = "+(3.14f*(radius*radius)));
	 }
}
