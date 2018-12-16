package scripteer;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

import java.io.File;

public class Stepdefs {
	
	private String[] params;
	
	@Given("^a sql query is set as a parameter$")
	public void a_sql_query_is_set_as_a_parameter() throws Exception { 
		this.params[0] = "UPDATE testTable SET Nom = $A WHERE Id = $B";
	}

	@Given("^a source file is set as a parameter$")
	public void a_source_file_is_set_as_a_parameter() throws Exception {
	}

	@When("^I run the program$")
	public void i_run_the_program() throws Exception {
	}

	@Then("^a sql script should be created$")
	public void a_sql_script_should_be_created() throws Exception {
	    assertTrue(new File("test.sql").exists());
	}

}