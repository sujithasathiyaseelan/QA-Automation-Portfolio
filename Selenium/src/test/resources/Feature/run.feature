
@tag
Feature: Automating Selenium Tutotrial Page

  @tag1
  Scenario Outline: Input the values in TextBox Page
    Given User must launch the browser
    When User should fill "<Fullname>","<Email>","<CurrentAddress>","<Password>"
    And  Click on Submit
    Then Validate
   



    Examples: 
      | Fullname         | Email                 | CurrentAddress                         | Password|
      | Amy Michael      |     Amy@gmail.com    | 16347 E Geddes ln, parker CO-80016    | @1234 | 
      | Beth Stephen     |     Beth2@gmail.com  | 16343 E Geddes ln, parker CO-80016    |*43534 | 
