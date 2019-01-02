package io;

import java.io.File;
import java.io.IOException;

import data.SqlData;

public class FileWriter {
	public FileWriter(SqlData sqlData) {
		File file = new File("test.sql");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
