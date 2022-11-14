@mycourse

Feature: US1006 Dogru kullanici adi ve password ile pozitif login testi

  Scenario: TC12 Kullanici mycoursedemy sitesine giris yapabilmeli

    Given Kullanici "myUrl" ana sayfaya gider
    Then mycoursedemy anasayfa login linkine tiklar
    And mycoursedemy kullanici adi olarak "myValidEmail" girer
    And mycoursedemy password olarak "myValidPassword" girer
    And mycoursedemy login butonuna basar
    Then mycoursedemy giris yapabildigini test eder
    And Sonra da sayfayi kapatir