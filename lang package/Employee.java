import java.util.Scanner;
class Employee {
	protected String name, desig, depart;
	protected int basicSalary;
	public Employee() {
		name = new String();
	}
	public Employee(String name, String desig, String depart, int basicSalary) {
		this.name = name;
		this.desig = desig;
		this.depart = depart;
		this.basicSalary = basicSalary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig ;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepat(String depart) {
		this.depart = depart;
	}
	public int getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}
	public float getHra() {
		return 0.2f * basicSalary; 
	}
	public float getDa() {
		return 0.1f * basicSalary;
	}
	public float getCa() {
		return 0.1f * basicSalary;
	}
	public void acceptData() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter name:");
		name = in.nextLine();
		System.out.println("Enter designation:");
		desig = in.nextLine();
		System.out.println("Enter department:");
		depart = in.nextLine();
		System.out.println("Enter basic salary:");
		basicSalary = in.nextInt();
	}
	public void showData() {
		System.out.println("Name :"+name );
		System.out.println("Designation : "+desig);
		System.out.println("Department : "+depart);
		System.out.println("Basic salary : "+basicSalary);
	}
	public String toString() {
		return "Student : [ Name : "+name+", Designation : "+desig+", Basic Salary : "+basicSalary+", department : "+depart+" ]";
	} 
	public boolean equals(Object o) {
		if (o != null && o instanceof Employee) {
			Employee e = (Employee) o;
			if(name.equals(e.name) && desig.equals(e.desig) && depart.equals(e.depart) && basicSalary == e.basicSalary)
				return true;
		}
		return false;
	}
	public int hashCode() {
		return name.length()+depart.length()+desig.length()+basicSalary;
	}
	public static void main(String args[]) {
		Employee obj = new Employee();
		Employee obj1 = new Employee("Rahul", "CEO", "Elictical", 25000);
		Employee obj2 = new Employee("Rahul", "CEO", "Elictical", 25000);
		Employee obj3 = obj1;
		System.out.println(obj1.equals(obj2));  //true
		System.out.println(obj2.equals(obj1));  //true
		System.out.println(obj1.equals(obj3));  //true
		System.out.println(obj1);
		//obj1.showData();
		//obj.acceptData();
		//obj.showData();
		System.out.println("HRA Incentive : "+obj.getHra());
		System.out.println("DA Incentive : "+obj.getDa());
		System.out.println("CA Incentive : "+obj.getCa());
	}
}
