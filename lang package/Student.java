import java.util.Scanner;
class Student {
	protected String name, clasName, section;
	protected int marks[] = new int[4], i, total = 0;
	protected float exaMar = 400f, per = 0;
	public Student() {
		 name = new String();
	}
	public Student(String name, String section, String clasName) {
		this.name = name;
		this.section = section;
		this.clasName = clasName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClas() {
		return clasName;		
	}
	public void setClas(String clasName) {
		this.clasName = clasName;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public void acceptData() {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter Student name:");
		name = a.nextLine();
		System.out.println("Enten class Name:");
		clasName = a.nextLine();
		System.out.println("Enter Section:");
		section = a.nextLine();
		System.out.println("Enter marks of four sub:");
		for(i = 0; i < marks.length; i++) {
			marks[i] =  a.nextInt();
		}		
	}
	public void showData() {
		System.out.println("Student name is : "+name);
		System.out.println("Student class is : "+clasName);
		System.out.println("Student Section : "+section);
		System.out.println("Student marks is : ");
		for(i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
			total += marks[i];
		}
	}
	public int totalMarks() {
		return total;
	}
	public float percentage() {
		return total * 100f/exaMar;
	}
	public String toString() {
		return "Student : [ "+name+ ", "+clasName+", "+section+" ]";
	}
	public boolean equals(Object o) {
		if (o != null && o instanceof Student) {
			Student e = (Student) o;
			if (name.equals(e.name) && clasName.equals(e.clasName) && section.equals(e.section))
				return true;
		}
		return false;
	}
	public int hashCode() {
		return name.length();
	}
	public static void main(String args[]) {
			Student c = new Student("Imtiyaz", "A", "12");
			Student c1 = new Student("Imtiyaz", "A", "12");
			Student c2 = c;
			System.out.println(c.equals(c1));   //true
			System.out.println(c1.equals(c));   //true 
			System.out.println(c2.equals(c));   //true 
			System.out.println(c);
			c.showData();
			c.acceptData();
			c.showData();
			System.out.println("total marks is: "+c.totalMarks());	
			System.out.println("total percentage out of 400 is: "+c.percentage());
	}

}
