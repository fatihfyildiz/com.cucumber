

Feature: US1005 Parametereli Configuration.Properties Kullanimi

  # 3 farkli senaryo olusturup
  # amazon, mycoursedemy ve wisequarter anasayfalarina gidip
  # url'nin bu anasayfalari icerdigini test edin

  Scenario: TC09 Kullanici amazon sayfasina gidebilmeli

    Given Kullanici "amazonUrl" ana sayfaya gider
    Then url'in "amazon" icerdigini test eder
    And Sonra da sayfayi kapatir

  Scenario: TC10 Kullanici mycoursedemy sayfasina gidebilmeli

    Given Kullanici "myUrl" ana sayfaya gider
    Then url'in "mycoursedemy" icerdigini test eder
    And Sonra da sayfayi kapatir

  Scenario: TC11 Kullanici wisequarter sayfasina gidebilmeli

    Given Kullanici "wiseUrl" ana sayfaya gider
    Then url'in "wisequarter" icerdigini test eder
    And Sonra da sayfayi kapatir