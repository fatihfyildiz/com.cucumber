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
        | yanlisIsim2 | yanlisSoyisim2 | yanlisEmail2 | yanlisPassword2 |
        | yanlisIsim3 | yanlisSoyisim3 | yanlisEmail3 | yanlisPassword3 |
        | yanlisIsim  | yanlisSoyisim2 | dogruEmail   | yanlisPassword2 |
        | yanlisIsim2 | yanlisSoyisim2 | yanlisEmail  | dogruPassword   |
        | dogruIsim   | yanlisSoyisim3 | dogruEmail   | yanlisPassword  |



