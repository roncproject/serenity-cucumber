Feature: Shop for product

  Scenario: Log on Sauce Demo
    Given Sergey is going to SauceDemo
    Then he sees login cred "Accepted usernames are:"
    Then he sees login pass "Password for all users:"
    When he enters username "standard_user"
    When he enters password "secret_sauce"
    When he clicks login button

    Then he sees page title "PRODUCTS"
    Then he sees page footer "© 2021 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy"
    Then he sees twitter link "https://twitter.com/saucelabs"
    Then he sees facebook link "https://www.facebook.com/saucelabs"
    Then he sees linkedin link "https://www.linkedin.com/company/sauce-labs/"
    Then he clicks twitter link

#
#  Scenario: See product item 1
#    Given Sergey is going to SauceDemo
#    When he enters username "standard_user"
#    When he enters password "secret_sauce"
#    When he clicks login button
#
#    Then he sees item 1 description "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection."
#    Then he sees item 1 name "Sauce Labs Backpack"
#    Then he sees item 1 price "$29.99"
#    Then he sees item 1 add "ADD TO CART"
#
#
#  Scenario: See product item 2
#    Given Sergey is going to SauceDemo
#    When he enters username "standard_user"
#    When he enters password "secret_sauce"
#    When he clicks login button
#
#    Then he sees item 2 description "A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included."
#    Then he sees item 2 name "Sauce Labs Bike Light"
#    Then he sees item 2 price "$9.99"
#    Then he sees item 2 add "ADD TO CART"
