Feature: Convert file to sql
	Command-line application that read data from a file and create a sql script
	from a sql query.
	
	Scenario Outline: Create a sql script
		Given a sql query <query> is set as a parameter
		And a source file <name><type> is set as a parameter 
		When I run the program
		Then a sql script named <name>.sql should be created
		
	Examples:
		|query|name|type|
		|"UPDATE test SET nom = --B where nom = --C"|test|.csv|