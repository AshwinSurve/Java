package Test;

public abstract class Employee {
	String name,address;
	int emp_no;
	public Employee() {
		
	}
	
	public Employee(String name,String address,int emp_no) {
		System.out.println("Inside Constructor.");
		this.name = name;
		this.address = address;
		this.emp_no = emp_no;
	}
	 public String getName() {
		 return name;
	 }
	 public String getAddress() {
		 return address;
	 }
	 public int getNo() {
		 return emp_no;
	 }
	 
	 public void setAddress(String address1) {
		 address = address1;
	 }
	  public void show() {
		  System.out.println("Name = "+name+" Address = "+address);
	  }
}
