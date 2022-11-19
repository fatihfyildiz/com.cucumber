Feature: US1007 Yanlis Bilgilerle Giris yapilamaz

  # 3 farkl isenaryo ile Negatif Login Testi yapalim

  Scenario: TC13 Yanlis email, dogru password ile giris yapilamamali

    Given Kullanici "myUrl" ana sayfaya gider
    # And mycoursedemy cookies butonuna basar
    Then mycoursedemy anasayfa login linkine tiklar
    Then mycoursedemy kullanici adi olarak "myInvalidEmail" girer
    And mycoursedemy password olarak "myValidPassword" girer
    And mycoursedemy login butonuna basar
    Then mycoursedemy giris yapilamadigini test eder
    And Sonra da sayfayi kapatir

  Scenario: TC14 gecerli email, yanlis password ile giris yapilamamali

    Given Kullanici "myUrl" ana sayfaya gider
    # And mycoursedemy cookies butonuna basar
    Then mycoursedemy anasayfa login linkine tiklar
    Then mycoursedemy kullanici adi olarak "myValidEmail" girer
    And mycoursedemy password olarak "myInvalidPassword" girer
    And mycoursedemy login butonuna basar
    Then mycoursedemy giris yapilamadigini test eder
    And Sonra da sayfayi kapatir

  Scenario: TC15 yanlis email, yanlis password ile giris yapilamamali

    Given Kullanici "myUrl" ana sayfaya gider
    # And mycoursedemy cookies butonuna basar
    Then mycoursedemy anasayfa login linkine tiklar
    Then mycoursedemy kullanici adi olarak "myInvalidEmail" girer
    And mycoursedemy password olarak "myInvalidPassword" girer
    And mycoursedemy login butonuna basar
    Then mycoursedemy giris yapilamadigini test eder
    And Sonra da sayfayi kapatir