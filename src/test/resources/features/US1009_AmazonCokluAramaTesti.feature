
Feature: US1009 Kullanici liste olarak verilen urunleri Amazon'da aratir

# Amazon anasayfaya gidip Nutella, Java, Apple, Samsung, LG icin arama yapip
# arama sonuclarinin aranan kelimeleri icerdigini test edin

  Scenario Outline: TC17 Kullanici liste olarak arama testi yapabilmeli

    Given Kullanici "amazonUrl" ana sayfaya gider
    Then Arama cubuguna "<istenenKelime>" yazip aratir
    And Arama sonuclarinin "<istenenKelime>" icerdigini test eder
    Then Sonra da sayfayi kapatir

    Examples:
    |istenenKelime|
    |Nutella      |
    |Java         |
    |Apple        |
    |Samsung      |
    |LG           |