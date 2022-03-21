package week1.day2;

public class Calculator {
	
	public int addition(int a,int b) {
		int add = a+b;
		return add;
	}
	public double subtract(double a,double b) {
		double sub = a-b;
		return sub;
	}
	public double multiply(double a, double b) {
		double mul = a*b;
		return mul;
	}
	public int divide(int a,int b) {
		int div = a/b;
		return div;
		
	}
	public static void main(String[] args) {
		Calculator cal= new Calculator();
		System.out.println(cal.addition(1, 2));
		System.out.println(cal.subtract(7.2, 5.1));
		System.out.println(cal.multiply(1.2, 3.4));
		System.out.println(cal.divide(8, 4));
	}

}
