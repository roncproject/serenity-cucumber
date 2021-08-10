Feature: Shop for product

  Scenario: Log on Sauce Demo
    Given Sergey is going to SauceDemo
    When he enters username "standard_user"
    When he enters password "secret_sauce"
    When he clicks login button
    Then he should see page with title "PRODUCTS"
#    Then he should see information about "Cucumber"

