Feature: Application Login

  Background: 
    Given setup the entries in database
    When launch the browser from config variables
    And hit the home page url of banking site

  #Reusable
  @RegressionTest @NetBanking
  Scenario: User Page default login
    Given User is on Netbanking Landing page
    When User login into the application with "user" and password "01234"
    Then Home page is displayed
    And cards are displayed

  @SmokeTest @RegressionTest @Mortgage
  Scenario Outline: Mortgage User Page default login
    Given User is on Netbanking Landing page
    When User login into the application with "<Username>" and password "<Password>"
    Then Home page is displayed
    And cards are displayed

    Examples: 
      | Username   | Password |
      | debituser  | hello12  |
      | credituser | lo1123   |
