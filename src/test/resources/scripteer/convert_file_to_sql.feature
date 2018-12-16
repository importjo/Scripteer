Feature: Convert file to sql
	Command-line application that read data from a file and create a sql script
	from a sql query.
	
	Scenario: Create a sql script
		Given a sql query is set as a parameter
		And a source file is set as a parameter 
		When I run the program
		Then a sql script should be created