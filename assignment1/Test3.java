import java.util.Scanner;
class Test3 {
	protected String name, address;
	protected long no;
	public void acceptData() {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter name: ");
		name = a.nextLine();
		System.out.println("Enter your address : ");
		address = a.nextLine();
		System.out.println("Enter your number:");
		no = a.nextLong();
	}
	public void showData() {
		System.out.println("Name is :"+name);
		System.out.println("Address is :"+address);
		System.out.println("Mobile No is :"+no);
	}
	public static void main(String args[]) {
	
		Test3 a = new Test3();
		a.acceptData();
		a.showData();
	}
}