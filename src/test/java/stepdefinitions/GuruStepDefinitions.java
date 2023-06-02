package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.bouncycastle.crypto.agreement.srp.SRP6Client;
import org.junit.Assert;
import pages.Guru99Page;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GuruStepDefinitions {

    List<String> sirketlerListesi = new ArrayList<>();
    Guru99Page guru99Page = new Guru99Page();
    @Given("guru99 sayfasinda Cookies kabul eder")
    public void guru99_sayfasinda_cookies_kabul_eder() {
        Driver.getDriver().switchTo().frame(guru99Page.cookiesIFrame);
        guru99Page.acceptCookies.click();
    }
    @Then("Company listesini consola yazdirir")
    public void company_listesini_consola_yazdirir() {
        sirketlerListesi = ReusableMethods.stringListeCevir(guru99Page.sirketElementList);
        System.out.println(sirketlerListesi);
    }

    @And("listede {string} oldugunu test eder")
    public void listedeOldugunuTestEder(String istenenSirket) {
        Assert.assertTrue(sirketlerListesi.contains(istenenSirket));
    }

    @Then("tum sayfa Screenshot alir")
    public void tumSayfaScreenshotAlir() throws IOException {
        ReusableMethods.getScreenshot("Guru99");
    }
}
