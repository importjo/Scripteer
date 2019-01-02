package scripteer;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;
import java.io.File;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import app.Scripteer;

public class Stepdefs {

	private String[] params = new String[2];
	private Exception expectedException;

	@Given("^a sql query (.*) is set as a parameter$")
	public void a_sql_query_is_set_as_a_parameter(String sqlQuery) throws Exception {
		this.params[0] = sqlQuery;
	}

	@Given("^a source file (.*)(.*) is set as a parameter$")
	public void a_source_file_is_set_as_a_parameter(String sourceFile, String typeFile) throws Exception {
		this.params[1] = sourceFile + typeFile;
	}

	@When("^I run Scripteer$")
	public void i_run_the_program() {
		try {
			Scripteer.main(params);
		} catch (Exception e) {
			expectedException = e;
		}
	}

	@Then("^a sql script named (.*).sql should be created$")
	public void a_sql_script_should_be_created(String name) throws Exception {
		String newFileName = name + ".sql";
		assertThat("File is created", new File(newFileName).exists());
		new File(newFileName).delete();
	}

	@Then("^Scripteer should throw an error$")
	public void scripteer_should_throw_an_error() throws Exception {
		assertThat(expectedException, notNullValue());
	}
}