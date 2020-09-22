@TEC-1020 @ui @db @regressiontest
  Feature: Validating UI employees data will DB

    Scenario: Validating first four employees from UI data with DB
      Given User navigates to MyApp homepage
      When User get All data from UI
      Then User validates ui data with db data
