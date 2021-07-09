import java.util.Scanner;
class Rectangle extends Point { 
	private int width;
	private int height;
	public Rectangle() {
		super(10,25);
		width = 4;
		height = 8;
	}	
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height ;
	}
	public void setHeigth(int height) {
		this.height = height;
	}
	public float getArea() {
		return width * height;
	}
	public float getPerimeter() {
		return 2f * (width + height);
	}
	@Override
	public void acceptData() {
		super.acceptData();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Width Of Rectangle Class : ");
		width = in.nextInt();
		System.out.println("Enter Height Of Rectangle Class : ");
		height = in.nextInt();
	}
	@Override
	public void showData() {
		super.showData();
		System.out.println("Width of Rectangle Class  : "+width);
		System.out.println("height of Rectangle Class :"+height);
		System.out.println("Area is : "+getArea());
		System.out.println("Perimeter is  : "+getPerimeter());
	}
	public static void main(String args[]) {
		Rectangle r = new Rectangle();
		r.acceptData();
		r.showData();
		Point p = new Point(5, 4);
		p.showData();	
	}	
}