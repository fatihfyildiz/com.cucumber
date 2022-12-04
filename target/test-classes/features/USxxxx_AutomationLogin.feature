@trial
Feature: USxxxx Automation Login Test

  Scenario: Kullanici basarili bir sekilde grisi yapabilmeli

    Given Kullanici "myAutomationUrl" sayfasina gider
    Then Kullanici Signout Butonuna tiklar
    Then Kullanici email bolumune "mail" girer
    Then Kullanici password bolumune "password" girer
    Then Kullanici Login Butonuna tiklar
    Then Kullanici Automation sayfasina giris yaptigini test eder
    And Sonra da sayfayi kapatir