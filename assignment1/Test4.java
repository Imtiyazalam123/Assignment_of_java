import java.util.Scanner;
class Test4 {
	protected float radius;
	public void acceptRadius() {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter Radius");
		radius = a.nextFloat();
		System.out.println("Area of Circle : "+(float)(Math.PI * Math.pow(radius, 2)));
		System.out.println("Circumference of circle : "+(float)(2 * Math.PI * radius));
	}
	public static void main(String args[]) {
		Test4 obj = new Test4();
		obj.acceptRadius();
	}
}