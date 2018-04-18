Feature: Product Summary

  Scenario: Validate default BNA is displayed for user not logged in
    Given I select Home Services
    When I select home care products
    Then I should see the default BNA


    Scenario:  Validate personalised BNA is displayed for logged in user
      Given that I am a logged in user
      And I select Home Services
      When I select home care products
      Then I should see personalised BNA


