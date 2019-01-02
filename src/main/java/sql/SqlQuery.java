package sql;

public class SqlQuery {
	
	public SqlQuery(String inputQuery) throws Exception {
		if(!inputQuery.contains("--")) {
			throw new Exception("No column found in sql query.");
		}
	}
}
