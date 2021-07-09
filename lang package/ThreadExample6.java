package imtiyaz.lang;
import java.util.Scanner;

class AlphabetCounterThread extends Thread {
	
	String string[];
	int counts[];
	int count;
		public AlphabetCounterThread(String[] string, int[] counts) {
			super("AlphabetCounterThread");
			this.string = string;
			this.counts = counts;
		}
		public void run() {
			for(int i = 0; i < string.length; i++) {
				for(int j = 0; j < string[i].length(); j++) {
					char c = string[i].charAt(j);
					if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
						count++;
				}
				counts[i] = count;
				count = 0;
			}
		for(int s = 0; s < string.length; s++)
				System.out.println(s+1+" String Alphabets is "+counts[s]);
	}
}
class ThreadExample6 {
		public static void main(String args[]) {
			String string[] = new String[10];
			int counts[] = new int[string.length];
			System.out.println("Enter 10 String : ");
			Scanner in = new Scanner(System.in);
			for(int i = 0; i < 10; i++) {
				string[i] = in.nextLine();
			}
			AlphabetCounterThread act = new AlphabetCounterThread(string, counts);
			act.start();
			System.out.println(act);
		}
}


