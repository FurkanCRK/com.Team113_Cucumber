package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.MasaTenisiPage;
import utilities.ConfigReader;
import utilities.Driver;

public class MasaTenisiStepDefinitions {
    MasaTenisiPage masaTenisiPage = new MasaTenisiPage();

    @Given("Kullanici {string} sitesine gider")
    public void kullanici_sitesine_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("masaTenisiUrl"));
    }
    @Then("Kullanici arama kutusuna {string} yazip aratir")
    public void kullanici_arama_kutusuna_yazip_aratir(String aranacakKelime) {
        masaTenisiPage.aramaKutusu.sendKeys(aranacakKelime+ Keys.ENTER);

    }

    @Then("Kullanici yeni urunler sayfasinda goruntulenen ilk urune tiklar")
    public void kullanici_yeni_urunler_sayfasinda_goruntulenen_ilk_urune_tiklar() {
        masaTenisiPage.ilkUrunElementi.click();

    }


    @And("Kullanici filtreler bolumunden filtresini secer")
    public void kullaniciFiltrelerBolumundenFiltresiniSecer() {
        masaTenisiPage.yeniUrunFiltreElementi.click();
    }
}
