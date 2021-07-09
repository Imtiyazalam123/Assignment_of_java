import java.util.Scanner;
class Count {
	protected int a = 0;
	protected static int count;
	public Count() {
		count++;
	}
	public Count (int a) {
		this.a = a;
		count++;
	}
	public static int getCount() {
		return count;
	}
	public void acceptData() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter A : ");
		a = in.nextInt();
	}
	public void showData() {
		System.out.println("A = "+a);
		System.out.println("number of object created : "+getCount());
		if(count < 5)
			System.out.println("too less");
		else if(count == 5)
			System.out.println("will do");
		else
			System.out.println("Exceeding the limits");
	}
	public static void main(String args[]) {
		Count obj = new Count();
		Count obj1 = new Count(2);  	
		Count obj2 = new Count(3);
		Count obj3 = new Count(2);
		obj.showData();
	}
}