@ffy
  Feature: USyyyy Automation Negative Login Test

    Scenario Outline: Kullanici negatif bilgiler girdiginden giris yapilamaz

      Given Kullanici "myAutomationUrl" sayfasina gider
      Then Kullanici Signout Butonuna tiklar
      Then Kullanici email bolumune "<mail>" girer
      Then Kullanici password bolumune "<password>" girer
      Then Kullanici Login Butonuna tiklar
      Then Kullanici sayfaya giris yapilamadigini test eder
      Then Sonra da sayfayi kapatir

      Examples:
      |mail           |password|
      |myInvalidEmail1|myInvalidPassword1|
      |myInvalidEmail2|myInvalidPassword2|
      |myInvalidEmail3|myInvalidPassword3|
      |myInvalidEmail4|myInvalidPassword4|

