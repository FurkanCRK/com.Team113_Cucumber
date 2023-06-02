Feature: US1010 Kullanici yanlis email ile sisteme giris yapamaz
  @ae
  Scenario: TC16 eksik email ile sisteme giria yapilamaz

    Given Kullanici "autoUrl" anasayfaya gider
    Then user sign up linkine tiklar
    And Login to your account blumunde email kutusuna @isareti olmayan email adresi yazar
    And password kutusuna sifre yaar ve enter'a tiklar
    Then sisteme giris yapilamadigini test eder
    And Sayfayi kapatir
