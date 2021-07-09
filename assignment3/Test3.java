import java.util.Scanner;
class Test3 {

	public static void main(String args[]) {
		String str = new String();
		Scanner in = new Scanner(System.in);
		main:
		while(true) {
			System.out.println("Enter String:");
			str = in.nextLine();
			if(str.length() < 5) {
				System.out.println("atlast 5 chatacter required");
				continue;
			}
			for(int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if(!(c >= 48 && c <= 57)) {
					System.out.println("alphabets and special character not required.");
					continue main;
				}
			}
			System.out.println(str);
			break;
		}
	}
}		