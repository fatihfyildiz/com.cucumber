@SystemTest
  Feature: US037 recharge - offline - index tests / Administrator should be able to view balance changes made offline

    Scenario: TC_3701 Verify that the Offline Recharge List is available on the Offline Recharge page

      Given Open browser go to url "AdminUrl"
      Then Admin enters an "email", a "password" and then clicks sign in link on admin page to login
      Then Admin clicks Wallet Manage link
      Then Admin clicks Offline Recharge link
      Then Admin verifies that Offline Recharge List is displayed on the Offline Recharge Page
      And Closes the page
@fatih
    Scenario: TC_3702 It should be verified that transactions are listed according to information in the Offline Recharge List

      Given Open browser go to url "AdminUrl"
      Then Admin enters an "email", a "password" and then clicks sign in link on admin page to login
      Then Admin clicks Wallet Manage link
      Then Admin clicks Offline Recharge link
      Then Admin verifies that transactions are listed according to SL information in the Offline Recharge List
      Then Admin verifies that transactions are listed according to Date information in the Offline Recharge List
      Then Admin verifies that transactions are listed according to Email information in the Offline Recharge List
      Then Admin verifies that transactions are listed according to TXN ID information in the Offline Recharge List
      Then Admin verifies that transactions are listed according to Amount information in the Offline Recharge List
      Then Admin verifies that transactions are listed according to Type information in the Offline Recharge List
      Then Admin verifies that transactions are listed according to Payment Method information in the Offline Recharge List
      Then Admin verifies that transactions are listed according to Approval information in the Offline Recharge List
      Then Admin verifies that transactions are listed according to Action information in the Offline Recharge List
      And Closes the page