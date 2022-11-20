@paralleltest2

  Feature: US1008 Herokuapp Wait Testleri
    
    Scenario: TC16 Kullanici wait islemlerinin calistigini test eder
      
      Given Kullanici "herokuUrl" ana sayfaya gider
      Then Herokuapp Add Element butonuna basar
      And Herokuapp Delete butonu gorunmesini bekler
      And Herokuapp Delete butonunun gorunur oldugunu test eder
      Then Herokuapp Delete butonuna basarak butonu siler
      And Herokuapp Delete butonunun gorunmedigini test eder
      Then Sonra da sayfayi kapatir

# Yeni bir sayfada calismaya basladigimizda
# 1- Feature dosyasi olusturalim
# 2- Eksik adimlari olusturmak icin
#    Runner Class'inda dryRun= true yapip Runner'i calistiralim
#    Terminal'de olusan yen iadimlari, Yeni bir StepDefinitions Calss olusturup icerisine yapistiralim
# 3- StepDefinitions Class'indaki eksik adimlarin Java kodlarini POM'e uygun olarak yazalim
# 4- Locate'leri yapmak icin PAge sayfasi olusturalim
#    Page class'ini acinca bir constructur olusturup Pagefactory.initElements() methodunu kullanarak Driver'imizi tanitalim