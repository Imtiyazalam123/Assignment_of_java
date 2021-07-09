package imtiyaz;
import java.io.*;
class Example7 {

	public static void main(String[] args) {
		String fileName = args[0];
		int count = 0;
		int c;
		File file = new File(fileName);
	
		System.out.println("This is File or Not : "+file.isFile());
		try {
			FileReader fr = new FileReader(file);
			while((c = fr.read()) != -1) {
				if((c >= 65 && c <= 90) || (c >= 97 && c <= 122))
					count++;
			}
			fr.close();
			System.out.println("Number of alphabets in this File is "+count);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ie) {
			
		}
	}

}
