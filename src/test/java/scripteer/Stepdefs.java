package scripteer;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;
import java.io.File;
import App.Scripteer;

public class Stepdefs {
	
	private String[] params = new String[2];
	
	@Given("^a sql query (.*) is set as a parameter$")
	public void a_sql_query_is_set_as_a_parameter(String slqQuery) throws Exception { 
		this.params[0] = slqQuery;
	}

	@Given("^a source file (.*)(.*) is set as a parameter$")
	public void a_source_file_is_set_as_a_parameter(String sourceFile, String typeFile) throws Exception {
		this.params[1] = sourceFile + typeFile;
	}

	@When("^I run the program$")
	public void i_run_the_program() throws Exception {
		Scripteer.main(params);
	}

	@Then("^a sql script named (.*).sql should be created$")
	public void a_sql_script_should_be_created(String name) throws Exception {
	    assertTrue(new File(name + ".sql").exists());
	    new File(name + ".sql").delete();
	}

}