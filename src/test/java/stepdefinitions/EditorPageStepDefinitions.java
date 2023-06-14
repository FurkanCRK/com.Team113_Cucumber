package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.EditorPage;
import utilities.Driver;

public class EditorPageStepDefinitions {
    EditorPage editorPage = new EditorPage();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();


    @Given("New butonuna basar")
    public void new_butonuna_basar() {
        editorPage.newButton.click();

    }
    @Given("Tum bilgileri girer")
    public void tum_bilgileri_girer() {
        editorPage.firstNameBox.sendKeys("frk");
        actions.sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB).sendKeys("asd")
                .sendKeys(Keys.TAB).sendKeys("of")
                .sendKeys(Keys.TAB).sendKeys("ex")
                .sendKeys(Keys.TAB).sendKeys("2023-06-14")
                .sendKeys(Keys.TAB).sendKeys("5000").perform();

    }
    @Given("Create tusuna basar")
    public void create_tusuna_basar() {
        editorPage.createButton.click();

    }
    @Given("Kullanici ilk isim ile arama yapar")
    public void kullanici_ilk_isim_ile_arama_yapar() {
        editorPage.searchBox.sendKeys("frk");

    }
    @Given("Isim bolumunde isminin oldugunu dogrular")
    public void isim_bolumunde_isminin_oldugunu_dogrular() {
        String expectedIcerik = "frk";
        String actualIcerik = editorPage.ilkElement.getText();

        Assert.assertTrue(actualIcerik.contains(expectedIcerik));

    }




}
