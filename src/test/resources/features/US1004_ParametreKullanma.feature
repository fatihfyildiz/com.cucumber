
  Feature: US1004 Parametre Kullanma


    Scenario: TC 08 Kullanici parametre ile verilen kelimeyi amazon'da aratabilmeli

      Given Kullanici Amazon ana sayfaya gider
      Then Arama cubuguna "Fatih" yazip aratir
      And Arama sonuclarinin "Fatih" icerdigini test eder
      And Sonra da sayfayi kapatir