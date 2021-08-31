package Test;

public class Emp extends Employee {
	double salary;

	public Emp(String name, String address, int emp_no, double sal) {
		super(name, address, emp_no);
		this.salary = sal;
	}

	public void setSal(double sal1) {
		salary = sal1;

	}

	public double getSal() {
		return salary;
	}

	public void show() {
		System.out.println("Salary = " + salary);
		System.out.println("Name = " + name + " Address = " + address);
	}
}
