class Test10 {

	public static void main(String args[]) {
		if(!(args.length == 1)) {
			System.out.println("invalid argument:");
			System.exit(0);
		}
		int a = Integer.parseInt(args[0]);
		System.out.println("Square of "+a+" = "+a*a);
	}
}