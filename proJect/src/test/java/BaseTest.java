import anlov.java.CommonActions;
import anlov.java.Config;
import anlov.java.pages.BaseElement;
import anlov.java.pages.BasePage;
import anlov.java.pages.BasketPage;
import anlov.java.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.asserts.SoftAssert;

public class BaseTest {
    protected static WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = PageFactory.initElements(driver, BasePage.class);
    protected HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    protected BasketPage basketPage = PageFactory.initElements(driver, BasketPage.class);
    protected BaseElement baseElement = PageFactory.initElements(driver, BaseElement.class);

    protected SoftAssert softAssert = new SoftAssert();

    @AfterSuite(alwaysRun = true)
    public void quit() {
        if (Config.QUIT_BROWSER) {
            driver.quit();
        }
    }
}