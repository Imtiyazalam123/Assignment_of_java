import java.util.Scanner;
class Test6 {
	protected int height, width;
	public void acceptData() {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter height :");
		height = a.nextInt();
		System.out.println("Enter width :");
		width = a.nextInt();
		System.out.println("Area of Rectangle is: "+(height * width));
		System.out.println("Perimeter of Rectangle is: "+2 * (height+width));
	}
	public static void main(String args[]) {
		Test6 obj = new Test6();
		obj.acceptData();
	}
}