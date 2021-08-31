package test;

public abstract class AbstractCl {
	String s1;
	public AbstractCl(String s) {
		this.s1 = s;
	}
	public String getName() {
		return s1;
	}
	
	public void show() {
		System.out.println("This is an "+s1+" Class. ");
	}
}
