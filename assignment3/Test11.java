class Test11 {

	public static void main(String args[]) {
		int temp = 0;
		int arr[] = new int[5];
		if(!(args.length == 5)) {
			System.out.println("required 5 arguments:");
			System.exit(0);
		}
		for(int i = 0; i < args.length; i++) {
			arr[i] = Integer.parseInt(args[i]);
		}
		int sum =0;
		for(int i = 0; i < args.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("sum is "+sum);
		float avg = sum/args.length;
		System.out.println("avrage is "+avg);
		for(int round = 1; round < arr.length; round++) {
			for(int swap = 0; swap <= arr.length-1-round; swap++) {         //here use buble short technic
				if(arr[swap] > arr[swap+1]) {
				temp = arr[swap];
				arr[swap] = arr[swap+1];
				arr[swap+1] = temp;
				}
			}
		}
		for(int j = 0; j < arr.length; j++)
			System.out.print(" "+arr[j]);
	}
}