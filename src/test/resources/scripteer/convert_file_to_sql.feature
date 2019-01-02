Feature: Convert file to sql
  Command-line application that read data from a file and create a sql script
  base on a sql query.

  Scenario Outline: Create a sql script
    Given a sql query <query> is set as a parameter
    And a source file <name><type> is set as a parameter
    When I run Scripteer
    Then a sql script named <name>.sql should be created

    Examples: 
      | query                                       | name | type |
      | "UPDATE test SET nom = --B where nom = --C" | test | .csv |

  Scenario Outline: Error if query doesn't contain delimiter
    Given a sql query <query> is set as a parameter
    And a source file <name><type> is set as a parameter
    When I run Scripteer
    Then Scripteer should throw an error

    Examples: 
      | query                                | name | type |
      | "UPDATE test SET nom =  where nom =" | test | .csv |

  Scenario Outline: Error if source file is not found
    Given a sql query <query> is set as a parameter
    And a source file <name><type> is set as a parameter
    When I run Scripteer
    Then Scripteer should throw an error

    Examples: 
      | query                                        | name      | type |
      | "UPDATE test SET nom = --A  where nom = --C" | wrongFile | .csv |