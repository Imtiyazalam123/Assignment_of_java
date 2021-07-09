class StringLibrayStatic {
	static String stringOp(StringFunc sf, String s) {
		return sf.func(s);
	}
	static int numOp(StringFunc1 ref, String st) {
		return ref.func1(st);
	}
	public static void main(String args[]) {
		String inStr = "hello java";
		String inStr1 = inStr + " ";
		System.out.println("origanal :"+inStr);
		String outStr = stringOp(StringLibrary::toTitleCase, inStr1);
		System.out.println(outStr);
		System.out.println("with spaces :"+inStr1);
		outStr = stringOp(StringLibrary::removeSpace, inStr1);
		System.out.println("After removed spaces : "+outStr);
		int vowel = numOp(StringLibrary::countVowels, inStr);
		System.out.println("total vowels : "+vowel);
		int consonant = numOp(StringLibrary::countConsonants, inStr);
		System.out.println("total Consonants : "+consonant);
		int alphabets = numOp(StringLibrary::countAlphabets, inStr);
		System.out.println("total Alphabets : "+alphabets);
		int words = numOp(StringLibrary::countWords, inStr);
		System.out.println("total Words : "+words);
	}
}
	