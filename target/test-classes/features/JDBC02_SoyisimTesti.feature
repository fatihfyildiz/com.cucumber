
Feature: JDBC02 Kullanici id ile soyisim testi yapar

  Scenario: TC02 Kullanici id ile soyisim testi yapabilmeli

    Given Kullanici JDBC ile database'e baglanir
    Then id si 14 olan user'in "last_name" degerinin "Pymar" oldugunu test eder