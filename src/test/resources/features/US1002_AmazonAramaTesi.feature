

Feature: US1002 Amazon arama testi

  # Kullanicinin arama yapmasi icin 3 scenario olusturun
  # Nutella, Java ve Apple icin arama yapip  sonuclarin aranan kelime icerdigini test edin

  Scenario: TC 02 Kullanici Amazon'da Nutella aramasi yapar

    Given Kullanici Amazon ana sayfaya gider
    Then Arama cubuguna Nutella yazip aratir
    And Arama sonuclarinin Nutella icerdigini test eder
    And Sonra da sayfayi kapatir

  Scenario: TC 03 Kullanici Amazon'da Java aramasi yapar

    Given Kullanici Amazon ana sayfaya gider
    Then Arama kutusuna Java yazip aratir
    And Arama sonuclarinin Java icerdigini test eder
    And Sonra da sayfayi kapatir

  Scenario: TC 04 Kullanici Amazon'da Apple aramasi yapar

    Given Kullanici Amazon ana sayfaya gider
    Then Arama kutusuna Apple yazip aratir
    And Sonuclarin Apple icerdigini test eder
    And Sonra da sayfayi kapatir