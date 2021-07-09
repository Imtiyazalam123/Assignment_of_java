import java.io.*;
class FileExample5 {

	public static void main(String args[]) {
		File f = new File(".");
		String str[] = f.list();
		for(String ownDir : str)
			System.out.println(ownDir);
	}
}