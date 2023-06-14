Feature: tosiye ornek
  @takim
  Scenario: ornek stepler

    Given Kullanici "masaTenisiUrl" sitesine gider
    Then Kullanici arama kutusuna "lastik" yazip aratir
    And Kullanici filtreler bolumunden filtresini secer
    And Kullanici yeni urunler sayfasinda goruntulenen ilk urune tiklar
    And Sayfayi kapatir