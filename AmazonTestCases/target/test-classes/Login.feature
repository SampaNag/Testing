Feature:Checking Sign in functionality working as a user
  Scenario:verify user can login successfully
    Given User is on the home page
    When user clicks "Sign in" link
    And user types valid email "mayanag2017@gmail.com"  and password "Animation@123"
    And  user clicks on "Sign in"
    Then user should landed on the page with text "Hello, Maya"