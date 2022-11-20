
Feature: US1011 Automation Practice Kullanici Olusturma Testi

  Scenario: TC18 Kullanici yeni kullanici olusturabilmeli

  Given Kullanici "automationUrl" ana sayfaya gider
  And user signup linkine tiklar
  And new user bölümüne name ve email adresi girer
  And sign Up butonuna basar
  And user kisisel bilgilerini ve iletisim bilgilerini girer
  And user create account butonuna basar
  Then hesap olustugunu dogrulayin