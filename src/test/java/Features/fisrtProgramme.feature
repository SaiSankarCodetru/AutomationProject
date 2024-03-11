Feature: Application Login

  Background: 
    
    When launch the browser from config variables
    And hit the home page url of banking site

  @RegressionTest
  Scenario: Admin Page default logi
    Given User is on Netbanking Landing page
    When User login into the application with "admin" and password "1234"
    Then Home page is displayed
    And cards are displayed

  #Reusable
  @MobileTest
  Scenario: User Page default login
    Given User is on Netbanking Landing page
    When User login into the application with "user" and password "01234"
    Then Home page is displayed
    And cards are displayed

  @SmokeTest @RegressionTest
  Scenario Outline: Mortgage User Page default login
    Given User is on Netbanking Landing page
    When User login into the application with "<Username>" and password "<Password>"
    Then Home page is displayed
    And cards are displayed

    Examples: 
      | Username   | Password |
      | debituser  | hello12  |
      | credituser | lo1123   |

  @SmokeTest
  Scenario: User Page default sign up
    Given User is on Practice Landing page
    When User signup into the application
      | Sankar           |
      | Sai              |
      | Sankar@gmail.com |
      |       9638520147 |
    Then Home page is displayed
    And cards are displayed
