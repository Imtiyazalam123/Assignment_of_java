import java.util.Scanner;
class menuDriven {
	static String stringOp(StringFunc sf, String s) {
		return sf.func(s);
	}
	static int numOp(StringFunc1 ref, String st) {
		return ref.func1(st);
	}

	public static void main(String args[]) {
		char ch;
		do {
			Scanner a = new Scanner(System.in);
			System.out.println("a. conver string to title case.");
			System.out.println("b. remove spaces from string.");
			System.out.println("c. Count number of vowels in string.");
			System.out.println("d. Count number of consonants in string.");
			System.out.println("e. Count number of alphabets in string.");
			System.out.println("f.  Count number of word in string.");
			System.out.println("g. Exit..............");
			ch = a.nextLine().charAt(0);
			switch(ch) {

				case 'a' :	System.out.println("Enter String :");
					String inStr = a.nextLine();
					String inStr1 = inStr + " ";
					String outStr = stringOp(StringLibrary::toTitleCase, inStr1);
					System.out.println(outStr);
					break;		
				case 'b' :  System.out.println("Enter String :");
					String inStr2 = a.nextLine();
					String inStr3 = inStr2 + " ";
					String outStr1 = stringOp(StringLibrary::removeSpace, inStr3);
					System.out.println("After removed spaces : "+outStr1);
					break;
				case 'c' :   System.out.println("Enter String :");
					String inStr4 = a.nextLine();
					int vowel = numOp(StringLibrary::countVowels, inStr4);
					System.out.println("total vowels : "+vowel);
					break;
				case 'd' :   System.out.println("Enter String :");
					String inStr5 = a.nextLine();	
					int consonant = numOp(StringLibrary::countConsonants, inStr5);
					System.out.println("total Consonants : "+consonant);
					break;
				case 'e' :  System.out.println("Enter String :");
					String inStr6 = a.nextLine();
					int alphabets = numOp(StringLibrary::countAlphabets, inStr6);
					System.out.println("total Alphabets : "+alphabets);
					break;
				case 'f' :     System.out.println("Enter String :");
					String inStr7 = a.nextLine();
					int words = numOp(StringLibrary::countWords, inStr7);
					System.out.println("total Words : "+words);
					break;
				case 'g' :  System.out.println("Exit.....");
					break;
				default :  System.out.println("invailid choice....");
			}
		}while(ch != 'g');
	}	
}