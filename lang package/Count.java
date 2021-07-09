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
	
	public String toString() {
		return "Count : [ Count = "+count+", a = "+a+" ]";
	}
	public boolean equals(Object o) {
		if(o != null && o instanceof Count) {
			Count c = (Count) o;
		if(a.equals(c.a))
			return true;
		}
		return false;
	}	

	public static void main(String args[]) {
		Count obj = new Count();
		Count obj1 = new Count(2);  	
		Count obj2 = new Count(2);
		Count obj3 = obj1;
		//Count obj3 = new Count(2);
		System.out.println(obj1.equals(obj2));
		System.out.println(obj2.equals(obj1));
		System.out.println(obj3.equals(obj1));
		System.out.println(obj3);
		//obj.showData();
	}
}