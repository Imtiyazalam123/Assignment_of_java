import java.util.Scanner;
public class TempEmp extends Employee1 {
	protected String wageGrade;
	protected int daysWorked;
	public TempEmp() {
	}
	public TempEmp( String name, int code, String wageGade, int daysWorked) {
		super(name, code);
		this.wageGrade = wageGrade;
		this.daysWorked = daysWorked;
	}
	public String getWageGrade() {
		return wageGrade;
	}
	public void setWageGrade(String wageGrade) {
		this.wageGrade = wageGrade;
	}
	public int getDaysWorked() {
		return daysWorked;
	}
	public void setDaysWorked(int daysWorked) {
		this.daysWorked = daysWorked;
	}
	@Override
	public void acceptData() {
		super.acceptData();
		Scanner a = new Scanner(System.in);
		System.out.println("Enter Wage Grade : ");
		wageGrade = a.nextLine();
		System.out.println("Enter No of Days Worked : ");
		daysWorked = a.nextInt();
	} 
	@Override
	public void showData() {
		super.showData();
		System.out.println("Wage Grade : "+wageGrade);
		System.out.println("Number of Days Worked : "+daysWorked);
	}
	public static void main(String args[]) {
		TempEmp obj1 = new TempEmp();
		obj1.acceptData();
		obj1.showData();
	}
}