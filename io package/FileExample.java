import java.io.*;
class FileExample {

	public static void main(String args[]) {
		boolean b = false;
		String str = args[0];
		try {
			File f = new File("f:/assignment java", str);
			System.out.println("File Existence is : "+f.exists());
			b = f.createNewFile();
			System.out.println("File  is create or not : "+b);
			System.out.println("File Existence is : "+f.exists());
			
			System.out.println("File Existence of command line argument :"+f.isFile());
			System.out.println("File Name is : "+f.getName());
			System.out.println("File Parent is : "+f.getParent());
			System.out.println("File Path is : "+f.getPath());
			System.out.println("File Length is : "+f.length());
			long lm = f.lastModified();
			java.util.Date d = new java.util.Date(lm);
			System.out.println(d);
			File contentList = new File("D:\\photo");
			System.out.println("Existence of file directory : "+contentList.isDirectory());
			String arr[] = contentList.list();
			for(String files : arr) 
				System.out.println(files);
		} catch (IOException e) {
		}
		catch (ArrayIndexOutOfBoundsException a) {
		}
	}
}