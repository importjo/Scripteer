package app;

import data.SourceFileData;
import data.SqlData;
import io.FileWriter;
import io.Parameters;
import sql.SqlQuery;

public class Scripteer {

	public static void main(String[] args) throws Exception {
		Parameters parameters = new Parameters(args);
		SqlQuery sqlQuery = new SqlQuery(parameters.getSqlQuery());
		SourceFileData sourceFileData = new SourceFileData(parameters.getSourceFile());
		SqlData sqlData = new SqlData(sqlQuery, sourceFileData);
		FileWriter fileWriter = new FileWriter(sqlData);
	}
}