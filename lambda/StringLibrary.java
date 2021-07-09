 class StringLibrary {
	public static String toTitleCase(String str) {
		String title = "", ret = "";
		for(int i =0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c != ' ') {
				title = title + str.charAt(i);
			}
			else {
				title = Character.toUpperCase(title.charAt(0)) + title.substring(1) + " ";
				ret += title;
				title = "";
			}
		}
		return ret;
	} 
	public static String removeSpace(String str) {
		String result = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ' ')
				result += str.charAt(i);
		}
		return result;
	}
	public static int countVowels(String str) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c== 'o' || c == 'u')
				count++;
		}
		return count;
	}
	public static int countConsonants(String str) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(!(c == 'a' || c == 'e' || c == 'i' || c== 'o' || c == 'u' || c == ' '))
				count++;
		}
		return count;
	}
	public static int countAlphabets(String str) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c >= 65 && c <= 90 || c >= 97 && c <= 122 )
				count++;
		}
		return count;
	}
	public static int countWords(String str) {
		String str1[] = str.split(" ");
		int count = 0;
		for(int i = 0; i < str1.length; i++) {
			count++;
		}
		return count;
	}
}
