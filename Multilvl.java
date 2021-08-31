package test;

public class Multilvl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v,v1,v2;
		v = new Vehicle();
		v.print();
		v1 = new Cars();
		v1.print();
		v2 = new Bikes();
		v2.print();
		Cars c1,c2;
		c1 = new Tata();
		c1.print();
		c2 = new Honda();
		c2.print();
		Bikes b1,b2;
		b1 = new TVS();
		b1.print();
		b2 = new RE();
		b2.print();
	}

}
