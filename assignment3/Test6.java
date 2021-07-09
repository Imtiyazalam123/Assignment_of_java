import java.util.Scanner;
class Test6 {

	public static void main(String args[]) {
		String arr[] = new String[10];
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Enter names "+(i+1));
			arr[i] = in.nextLine();
		}
		for(String s : arr) {
			if(s.endsWith("h"))
				System.out.println(s);
		}
	}
				
}