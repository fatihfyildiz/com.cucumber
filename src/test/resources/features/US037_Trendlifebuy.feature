
  Feature: US037 recharge - offline - index tests

    @SystemTesting
    Scenario: TC_3701 Administrator should be able to view balance changes made offline

      Given Open browser go to url "AdminUrl"
      Then Admin enters an "email", a "password" and then clicks sign in link on admin page to login
      Then Admin clicks Wallet Manage link
      Then Admin clicks Offline Recharge link
      Then Admin verifies that Offline Recharge List is displayed on the Offline Recharge Page
      And Closes the page