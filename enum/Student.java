import java.util.Scanner;
class Student {
	protected String enrollmentNo;
	protected String name;
	protected Gender gender;
	protected String className;
	protected String section;
	protected House house;
	public Student() {
		enrollmentNo = new String();
		name = new String();
		className = new String();
		section = new String();
	}
	public Student(String enrollmentNo, String name, String className, String section, Gender gender, House house) {
		this.enrollmentNo = enrollmentNo;
		this.name = name;
		this.className = className;
		this.section = section;
		this.gender = gender;
		this.house = house;
	}
	public void acceptData() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Enrollment No : ");
		enrollmentNo = in.nextLine();
		System.out.println("Enter Student Name : ");
		name = in.nextLine();
		System.out.println("Enter Student Class : ");
		className = in.nextLine();
		System.out.println("Enter Section : ");
		section = in.nextLine();
		System.out.println("Enter Gender :");
		gender = Gender.acceptGender();
		System.out.println("Enter House : ");
		house = House.acceptHouse();
	}
	public void showData() {
		System.out.println("Student Enrollment No :"+enrollmentNo);
		System.out.println("Student Nmae :"+name);
		System.out.println("Student Classs :"+className);
		System.out.println("Student Section :"+section);
		System.out.println("Student Gender :"+gender);
		System.out.println("House :"+house+" Color "+house.getColor());
	}
	public static void main(String args[]) {
		Student s = new Student();
		s.acceptData();
		s.showData();
	}
}
