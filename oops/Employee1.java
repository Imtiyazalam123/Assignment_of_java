import java.util.Scanner;
public class Employee1 {
	protected String name;
	protected int code;
	public Employee1() {
		String name = new String();
	}
	public Employee1(String name, int code) {
		this.name = name;
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public void acceptData() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter name :");
		name = in.nextLine();
		System.out.println("Enter Code : ");
		code = in.nextInt();
	}
	public void showData() {
		System.out.println("Name  : "+name);
		System.out.println("Code : "+code);
	}
}