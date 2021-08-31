package test;

public class AbsInherit extends AbstractCl{
	String s2;
	public AbsInherit (String s1,String s2) {
		super(s1);
		this.s2 = s2;
	}
	
	public void display() {
		System.out.println("This is an Example of Abstract Class.  "+s2);
	}
}
