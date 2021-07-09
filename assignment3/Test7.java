import java.util.Scanner;
class Test7 {

	public static void main(String args[]) {
		String arr[] = new String[10];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 10 names:");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = in.nextLine();
		}
		for(String s : arr) {
			if(s.contains("he"))  //if(s.indexOf("he") != -1)
				System.out.println(s);		
		}	
			
	}
}