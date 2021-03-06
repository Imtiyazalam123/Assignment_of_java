import java.util.Scanner;
class Rectangle extends Point { 
	private int width;
	private int height;
	h.add(width);
	h.add(height);
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
	public String toString() {
		return "Rectangle : [ "+width+", "+height+" ]";
	}
	public boolean equals(Object o) {
		if(o != null && o instanceof Rectangle) {
			Rectangle rt = (Rectangle) o;
			if(x == rt.x && y == rt.y && width == rt.width && height == rt.height)
				return true;
		}
		return false;
	}
	public int hashCode() {
		return width+height;
	}
	public static void main(String args[]) {
		Rectangle r = new Rectangle();
		Rectangle r1 = new Rectangle(7, 8, 2, 5);
		Rectangle r2 = new Rectangle(7, 8, 2, 5);
		Rectangle r3 = r1;
		System.out.println(r1.equals(r2));
		System.out.println(r2.equals(r1));
		System.out.println(r1.equals(r3));
		//r.acceptData();
		//r.showData();
		Point p = new Point(5, 4);
		//p.showData();	
		System.out.println(r);
	}	
}
