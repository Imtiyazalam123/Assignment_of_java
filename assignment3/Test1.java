class Test1 {

	public static void main(String args[]) {
		String str = "Betty got a bit of bitter better butter";
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c == 'b')
				System.out.println(" "+i);
		}
		String s1[] = str.split(" ");
		for(int j = 0; j < s1.length; j++) {
			System.out.println(s1[j]);
		}
		System.out.println("Starts with \"b\"all words :");
		for(int k = 0; k < s1.length; k++) {
			if(s1[k].startsWith("b"))
				System.out.println(s1[k]);
		}
 	}
}