import java.util.Scanner;
class Point {
	protected int width, height;
	public Point() {
	}
	public Point(int width, int height) {
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
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void acceptData() {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter width:");
		width = a.nextInt();
		System.out.println("Enter height:");
		height = a.nextInt();
	}
	public void showData() {
		System.out.println("width is :"+width);
		System.out.println("height is :"+height);
	}
}