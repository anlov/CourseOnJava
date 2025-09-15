import jdk.jfr.Description;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

import static anlov.java.Constants.UrlPage.WILDBERRIES_HOME;

public class BasketTest extends BaseTest {
    @Test
    @Description("Проверка соответствия товаров в корзине")
    public void checkBasket() {
        final int COUNT = 3;
        basePage.openPage(WILDBERRIES_HOME);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            WebElement cookieAcceptButton = wait.until(
                    ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='cookies']//button[contains(text(), 'Окей')]"))
            );
            cookieAcceptButton.click();
        } catch (TimeoutException e) {
            System.out.println("Cookies banner not found or already closed");
        }
        homePage.addToBasket(COUNT);
        baseElement.clickBasket();
        basketPage.wait(1500).nameOfGoods();

        Assert.assertEquals(basketPage.getCountOfGoods(),
                homePage.getCountOfGoods(),"It's the difference goods");
        for (int i = 0; i < COUNT; i++) {
            softAssert.assertEquals(basketPage.getGoodsName(COUNT - i - 1),
                    homePage.getSelectedGoodsName(i), "It's the difference names");
            softAssert.assertEquals((basketPage.getGoodsPrice(COUNT - i - 1)),
                    homePage.getSelectedGoodsPrice(i), "It's the difference prices");
        }
        softAssert.assertEquals(basketPage.getSum(),
                homePage.getSumOfGoods(), "It's the difference sums");
    }
}