import java.io.File;
import java.io.IOException;

public class Example2 {

	public static void main(String[] args) {
		
		String directory = args[0];
		File dir = new File(directory);
		displayDirectoryContents(dir);
	}

	public static void displayDirectoryContents(File dir) {
		try {
			File[] files = dir.listFiles();
			for (File file : files) {
				if (file.isDirectory()) {
					System.out.println("directory:" + file.getCanonicalPath());
					displayDirectoryContents(file);
				} else {
					System.out.println("     file:" + file.getCanonicalPath());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}