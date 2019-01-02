package data;

import java.io.File;

public class SourceFileData {

	public SourceFileData(String inputFile) throws Exception {
		if (!new File(inputFile).exists()) {
			throw new Exception("Source file not found.");
		}
	}
}