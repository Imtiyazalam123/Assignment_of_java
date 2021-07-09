package imtiyaz.lang;
import java.util.Scanner;

class LotteryThread extends Thread {
	int num[];
	public LotteryThread(int[] num) {
		super("Lottery Thread");
		this.num = num;
		System.out.println(this);
	}
	public void run() {
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)((Math.random() * 20) + 1);
			//System.out.println(num[i]);
		}
	}
}
class LotteryTester {

	public static void main(String args[]) {
		int num[] = new int[5];
		int LotteryNo;
		LotteryThread th = new LotteryThread(num);
		th.start();
		try {
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter Lottery No, No should be 1 to 20 : ");
		Scanner in = new Scanner(System.in);
		LotteryNo = in.nextInt();
		int lottery = 0;
		for(int j = 0; j < 5; j++) {
			if(num[j] == LotteryNo) {
				lottery = 1;
				break;
			}
		}
		if(lottery == 1)
			System.out.println("Win The lottery........");
		else
			System.out.println("Loses The lottery........");
	}
}
