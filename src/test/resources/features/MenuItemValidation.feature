Feature: Menu Item Validation
  
  Developer - Chirag
  Tester   - Yusuf

  @datatable
  Scenario: Verify Login Successful With Valid Credentials
    Given user open website
    Then verify user is on login page
    When user login with username "login.username" and password "login.password"
    And verify user is navigated to homepage
    Then verify Job sub menu items has following data
      | Job Titles        |
      | Pay Grades        |
      | Employment Status |
      | Job Categories    |
      | Work Shifts       |

  @2dDatatable
  Scenario: Verify Table Data
    Given user open the datatables website
    Then verify user is on datatables home page
    Then verify data tables has following data
      | Airi Satou         | Accountant                    | Tokyo         | 33 | 2008/11/28 |
      | Angelica Ramos     | Chief Executive Officer (CEO) | London        | 47 | 2009/10/09 |
      | Ashton Cox         | Junior Technical Author       | San Francisco | 66 | 2009/01/12 |
      | Bradley Greer      | Software Engineer             | London        | 41 | 2012/10/13 |
      | Brenden Wagner     | Software Engineer             | San Francisco | 28 | 2011/06/07 |
      | Brielle Williamson | Integration Specialist        | New York      | 61 | 2012/12/02 |
      | Bruno Nash         | Software Engineer             | London        | 38 | 2011/05/03 |
      | Caesar Vance       | Pre-Sales Support             | New York      | 21 | 2011/12/12 |
      | Cara Stevens       | Sales Assistant               | New York      | 46 | 2011/12/06 |
      | Cedric Kelly       | Senior Javascript Developer   | Edinburgh     | 22 | 2012/03/29 |

  Scenario: Verify Table Data
    Given user open the datatables website
    Then verify user is on datatables home page
    Then verify data tables has following data using header
      | Name               | Position                      | Office        | age | Start date |
      | Airi Satou         | Accountant                    | Tokyo         |  33 | 2008/11/28 |
      | Angelica Ramos     | Chief Executive Officer (CEO) | London        |  47 | 2009/10/09 |
      | Ashton Cox         | Junior Technical Author       | San Francisco |  66 | 2009/01/12 |
      | Bradley Greer      | Software Engineer             | London        |  41 | 2012/10/13 |
      | Brenden Wagner     | Software Engineer             | San Francisco |  28 | 2011/06/07 |
      | Brielle Williamson | Integration Specialist        | New York      |  61 | 2012/12/02 |
      | Bruno Nash         | Software Engineer             | London        |  38 | 2011/05/03 |
      | Caesar Vance       | Pre-Sales Support             | New York      |  21 | 2011/12/12 |
      | Cara Stevens       | Sales Assistant               | New York      |  46 | 2011/12/06 |
      | Cedric Kelly       | Senior Javascript Developer   | Edinburgh     |  22 | 2012/03/29 |
