package app;

import java.io.File;
import java.io.IOException;

public class Scripteer {

	public static void main(String[] args) throws Exception {
		String sqlQuery = args[0];
		if(sqlQuery.contains("--")) {
			String sourceFile = args[1];
			if(new File(sourceFile).exists()) {
				File file = new File("test.sql");
				try {
					file.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				throw new Exception("Source file not found.");
			}
		} else {
			throw new Exception("No column found in sql query.");
		}
		
	}

}
