package app;

import java.io.File;
import java.io.IOException;

public class Scripteer {

	public static void main(String[] args) {
		File file = new File("test.sql");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
