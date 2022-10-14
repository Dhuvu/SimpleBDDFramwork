Feature: Nopcommerce RegistrationPage

  Background:
    Given User able to open browser
    And Enter Url

    Scenario: Nopcommerce Valid Registration Test
      Then User click on Registration Link
      And User on Registration page and  verify Registration page title
      Then user select the Gender and enter Firstname and Lastname and DOB and emailId
      And user enter Company Name and Password and ConfirmPassword
      Then User click on RegisterButton
      Then User is on Home page
      Then User close the browser