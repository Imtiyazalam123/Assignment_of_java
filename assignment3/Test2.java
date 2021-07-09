import java.util.Scanner;
class Test2 {

	public static void main(String args[]) {
		String str = new String();
		Scanner in = new Scanner(System.in);
		main:
		while(true) {
			System.out.println("Enter String:");
			str = in.nextLine();
			if(str.length() < 3) {
				System.out.println("atlast 3 character required");
				continue;
			}
			for(int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if(!(c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z')) {
					System.out.println("character or digits are not requires.");
					continue main;
					}
			}
			System.out.println(str);
			break;	
		}
	}
}