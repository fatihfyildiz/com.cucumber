@paralleltest2
Feature: US1003 Background kullanrak Amazon arama testi

  Background: Amazon anasayfaya gitme
    Given Kullanici Amazon ana sayfaya gider

  Scenario: TC 05 Kullanici Amazon'da Nutella aramasi yapar

    Then Arama cubuguna Nutella yazip aratir
    And Arama sonuclarinin Nutella icerdigini test eder
    And Sonra da sayfayi kapatir

  Scenario: TC 06 Kullanici Amazon'da Java aramasi yapar

    Then Arama kutusuna Java yazip aratir
    And Arama sonuclarinin Java icerdigini test eder
    And Sonra da sayfayi kapatir

  Scenario: TC 07 Kullanici Amazon'da Apple aramasi yapar

    Then Arama kutusuna Apple yazip aratir
    And Sonuclarin Apple icerdigini test eder
    And Sonra da sayfayi kapatir