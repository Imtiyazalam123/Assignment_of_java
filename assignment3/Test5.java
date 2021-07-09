import java.util.Scanner;
class Test5 {

	public static void main(String args[]) {
		String arr[] = new String[10];
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(" Enter name: "+(i+1));
			arr[i] = in.nextLine();
		}
		for(String s : arr) {
			if(s.startsWith("A"))
				System.out.println(s);
		}
		
	}
}