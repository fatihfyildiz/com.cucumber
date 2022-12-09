@SignUp
  Feature: USzzzz Quality Demy Sign Up Test

    Scenario Outline: Kullanici Yanlis Formatta Bilgilei Girdiginde Uyelik Hesabi Olusturamamali

      Given Kullanici "myUrl" ana sayfaya gider
      Then Kullanici Quality Demy Sign Up linkine tiklar
      Then Kullanici Firstname Kutusuna "<istenenIsim>" girer
      Then Kullanici Lastname Kutusuna "<istenenSoyisim>" girer
      Then Kullanici Email Kutusuna "<istenenEmail>" girer
      Then Kullanici Password Kutusuna "<istenenPassword>" girer
      Then Kullanici Quality Demy Sign Up Butonuna tiklar
      Then Kullanici uye hesabi olusturamadigini test eder
      And Sonra da sayfayi kapatir

      Examples:
        | istenenIsim | istenenSoyisim | istenenEmail | istenenPassword |
        | yanlisIsim  | yanlisSoyisim  | yanlisEmail  | yanlisPassword  |
        | yanlis2Isim | yanlis2Soyisim | yanlis2Email | yanlis2Password |
        | yanlis3Isim | yanlis3Soyisim | yanlis3Email | yanlis3Password |
        | yanlisIsim  | yanlis2Soyisim | dogruEmail   | yanlis2Password |
        | yanlis2Isim | yanlis2Soyisim | yanlisEmail  | dogruPassword   |
        | dogruIsim   | yanlis3Soyisim | dogruEmail   | yanlisPassword  |
        | dogruIsim   | dogruSoyisim   | dogruEmail   | dogruPassword   |


