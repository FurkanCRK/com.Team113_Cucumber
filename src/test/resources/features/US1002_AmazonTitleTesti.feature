Feature: US1002 Amazon Title Testi
  @amzn
  Scenario: TC04 amazon sayfasinin title'nin doru oldugunu konurol eder

    Given Kullanici amazon anasayfaya gider
    Then title'in Amazon icerdigini test eder
    And Sayfayi kapatir