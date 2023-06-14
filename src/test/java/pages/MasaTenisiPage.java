package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MasaTenisiPage {
    public MasaTenisiPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@id='txtbxArama']")
    public WebElement aramaKutusu;

    @FindBy (xpath = "(//*[@data-type='yeni'])[1]")
    public WebElement yeniUrunFiltreElementi;

    @FindBy (xpath = "(//*[@data-ll-status='loaded'])[1]")
    public WebElement ilkUrunElementi;





}
