/* Write a program  that display prime numbers from 100 to 200 */

class Test19 {

	public static void main(String args[]) {
		int i, j;
		for( i = 100; i <= 200; i++) {
			int b = 0;
			for( j = 2; j < i; j++) {
				if(i%j == 0) {
				   	b = 1;
					break;
				}
			}
			if(b == 0)
				System.out.println(i+"prime number");
		}
		
	}
}