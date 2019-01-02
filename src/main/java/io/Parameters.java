package io;

public class Parameters {

	private String sqlQuery;
	private String sourceFile;

	public Parameters(String[] args) throws Exception {
		validateParams(args);
		this.sqlQuery = args[0];
		this.sourceFile = args[1];
	}

	private void validateParams(String[] args) throws Exception {
		if(args.length > 3) {
			throw new Exception("Only three parameters are needed.");
		}
	}

	public String getSqlQuery() {
		return this.sqlQuery;
	}

	public String getSourceFile() {
		return this.sourceFile;
	}
}
