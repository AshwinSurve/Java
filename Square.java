package Test;

public class Square extends Shape{
	int length;
	public void setValue(int len) {
		this.length = len;
	}
	public int getArea() {
		return length*length;
	}
}
