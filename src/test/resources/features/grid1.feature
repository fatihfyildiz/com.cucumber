@grid1
  Feature: Grid Test Firefox

    Scenario: Firefox Test

      Given getURL firefox
      Then Verify title firefox
      And Verify currentURL firefox