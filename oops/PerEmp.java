import java.util.Scanner;
class PerEmp extends Employee1 {
	protected String department;
	protected String designation;
	protected int basicSalary;
	public PerEmp() {
		String department = new String();
		String designation = new String();
	}
	public PerEmp(String name, int code, String department, String designation, int basicSalary) {
		super(name, code);
		this.department = department;
		this.designation = designation;
		this.basicSalary = basicSalary;
	}
	public PerEmp(String department, String designation, int basicSalary) {
		this.department = department;
		this.designation = designation;
		this.basicSalary = basicSalary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public void acceptData() {
		super.acceptData();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Department : ");
		department = in.nextLine();
		System.out.println("Enter Designation :");
		designation = in.nextLine();
		System.out.println("Enter Basic Salary : ");
		basicSalary = in.nextInt();
	}
	@Override
	public void showData() {
		super.showData();
		System.out.println("Department : "+department);
		System.out.println("Designation : "+designation);
		System.out.println("Basic Salary : "+basicSalary);
	}
	public static void main(String args[]) {
		PerEmp obj1 = new PerEmp();
		obj1.acceptData();
		obj1.showData();
	}
}
