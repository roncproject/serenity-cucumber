Feature: Shop for product

  Scenario: Log on Sauce Demo
    Given Sergey is going to SauceDemo
    Then he sees login cred
  """
  Accepted usernames are:
    standard_user
    locked_out_user
    problem_user
    performance_glitch_user
  """
    Then he sees login pass "Password for all users:"
    When he enters username "standard_user"
    When he enters password "secret_sauce"
    When he clicks login button

    Then he sees page title "PRODUCTS"

  Scenario: See product item 1
    Given Sergey is going to SauceDemo
    When he enters username "standard_user"
    When he enters password "secret_sauce"
    When he clicks login button

    Then he sees item 1 description "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection."
    Then he sees item 1 name "Sauce Labs Backpack"
    Then he sees item 1 price "$29.99"
    Then he sees item 1 add "ADD TO CART"

