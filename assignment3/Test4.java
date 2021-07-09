import java.util.Scanner;
class Test4 {

	public static void main(String args[]) {
		String str = new String();
		Scanner in = new Scanner(System.in);
		main:
		while(true) {
			System.out.println("Enter String:");
			str = in.nextLine();
			if(str.length() < 6) {
				System.out.println("atleat 6 character required");
				continue;
			}
			for(int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if(!(c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c >= 48 && c <= 57 || c == '@')) {
					System.out.println("special character are not required except @");
					continue main;
				}
			}
			System.out.println(str);
			break;
		}
	}
}