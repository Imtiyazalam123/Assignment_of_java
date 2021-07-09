/* Write a program that display even number from100 to 200 */

class Test13 {

	public static void main(String args[]) {
		int i;
		for(i = 100; i <= 200; i++) {
			if(i%2 == 0) {
				System.out.println("Even : "+i);
			}
		}
	}
}