@paralleltest1
Feature: US1001 Amazon arama testi

  Scenario: TC01 Kullanici Amazon'da arama yapabilmeli

    Given Kullanici Amazon ana sayfaya gider
    When Arama cubuguna Nutella yazip aratir
    Then Arama sonuclarinin Nutella icerdigini test eder
