import java.util.Scanner;
class Circle{
	private double radius = 1;
	public Circle() {}
	public Circle(double radius) {this.radius = radius;}
	public double getPerimeter() {return(2*Math.PI * radius);}
	public double getArea() {return Math.PI * Math.pow(radius,2);}
	public double getRadius() {return radius;}
}
class Cylinder extends Circle{
	private double length = 1;
	public Cylinder() {}
	public Cylinder(double radius, double length) {
		super(radius);
		this.length=length;
	}
	public double getArea() {
		return (2*Math.PI*Math.pow(getRadius(), 2))+ (2* Math.PI * getRadius()* length);
		
	}
	
	public double getVolume() {
		return Math.PI * getRadius() *getRadius()* length;
	}
}
public class part2 {
	public static void main(String []args) {
		Scanner stdin= new Scanner(System.in) ;
		System.out.println("Enter radius for circle: ");
		double x = stdin.nextDouble();
		
		System.out.println("Enter the length: ");
		double y = stdin.nextDouble();

	    Circle t = new Circle(x);
	    
	    Cylinder v = new Cylinder(x,y);

	

		System.out.println("The area of a circle is");
		System.out.println(t.getArea());
		System.out.println("The perimeter ");
		System.out.println(t.getPerimeter());
		System.out.println();


		
		System.out.println("The Volume of a Cylinder");
		System.out.println(v.getVolume());
		System.out.println("The area is");
		System.out.println(v.getArea());


		
	}

}
