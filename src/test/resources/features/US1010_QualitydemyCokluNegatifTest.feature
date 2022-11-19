
Feature: US1010 Liste olarak verilen wrong user ile negatif login testi

  Scenario Outline:

    Given Kullanici "myUrl" ana sayfaya gider
    And mycoursedemy cookies butonuna basar
    Then mycoursedemy anasayfa login linkine tiklar
    And mycoursedemy kullanici adi olarak "<istenenEmail>" girer
    And mycoursedemy password olarak "<istenenPassword>" girer
    Then mycoursedemy login butonuna basar
    And mycoursedemy giris yapilamadigini test eder
    Then Sonra da sayfayi kapatir

    Examples:
    |istenenEmail|istenenPassword|
    |myInvalidEmail1|myInvalidPassword1|
    |myInvalidEmail2|myInvalidPassword2|
    |myInvalidEmail3|myInvalidPassword3|
    |myInvalidEmail4|myInvalidPassword4|