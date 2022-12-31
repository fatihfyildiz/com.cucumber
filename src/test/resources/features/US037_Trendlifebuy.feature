@SystemTest
  Feature: US037 recharge - offline - index tests / Administrator should be able to view balance changes made offline

    Scenario: TC_3701 Verify that the Offline Recharge List is available on the Offline Recharge page

      Given Open browser go to url "AdminUrl"
      Then Admin enters an "email", a "password" and then clicks sign in link on admin page to login
      Then Admin clicks Wallet Manage link
      Then Admin clicks Offline Recharge link
      Then Admin verifies that Offline Recharge List is displayed on the Offline Recharge Page
      And Closes the page