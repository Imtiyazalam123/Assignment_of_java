package imtiyaz;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class DetailsWrite {

	public static void main(String args[]) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("friend.txt"))) {
			for(int i = 1; i <= 10; i++) {
				Friend f = new Friend();
				f.acceptData();
				oos.writeObject(f);
				oos.flush();
			}
		System.out.println("Writing succesfully...........");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
