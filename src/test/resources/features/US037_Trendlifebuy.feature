
  Feature: US037 recharge - offline - index tests

    Scenario: Administrator should be able to view balance changes made offline

      Given Open browser go to url "AdminUrl"
      Then Admin enters an email to login on admin page
      Then Admin enters a password to login on admin page
      Then Admin clicks sign in on admin page to login