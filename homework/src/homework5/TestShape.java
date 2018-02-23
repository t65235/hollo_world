package homework5;

public class TestShape{
	 public static void main(String[] args) {
		 Circle a = new Circle(5);
		 System.out.println(a.computeArea()); 
		 System.out.println(a.computeCircumference());
		 Rectangle b =new Rectangle(3,4);
		 System.out.println(b.computeArea()); 
		 System.out.println(b.computeCircumference());
	 }
 }

interface Shape {
	double computeArea();
	double computeCircumference();
	
}
 class Circle implements Shape {
	private double r;
	Circle(double r){
		this.r=r;
	}
	private static final double PI = 3.14159;
	public double computeArea() {
		double a= r*r*PI;
		return a;
	 }
	public double computeCircumference() {
		double b= 2*r*PI;
		return b;
		}
 }
 
 class Rectangle implements Shape {
	 
	 	private double a, b;
	 	Rectangle(double a,double b){
	 		this.a =a;
	 		this.b =b;
	 	}
		public double computeArea() {
			double c= a*b;
			return c;
		 }
		public double computeCircumference() {
			double d= 2*a+2*b;
			return d;
			}
 }
 
 