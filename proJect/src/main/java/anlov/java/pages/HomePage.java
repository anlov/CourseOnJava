package anlov.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import anlov.java.Attribute;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class HomePage extends BasePage {
    private List<String> selectGoods;
    private List<String> selectPrices;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private static class Goods {
        private static final By lowerPrice = By.xpath("//span/ins");
        private static final By productName = By.xpath("//span[@class ='product-card__name']");
        private static final By addToBasket = By.xpath("//article//a[@href='/lk/basket']");
    }

    private static class Size {
        private static final By checkSize = By.xpath("//li/label");
    }

    public HomePage addToBasket(int num) {
        List<WebElement> productNames = driver.findElements(Goods.productName);
        selectGoods = productNames.stream().limit(num).map(p -> p.getAttribute(Attribute.innerText.toString())
                .split("/")[1].trim()).collect(Collectors.toList());
        List<WebElement> lowerPrices = driver.findElements(Goods.lowerPrice);
        selectPrices = lowerPrices.stream().limit(num).map(p -> p.getText().split("₽")[0]
                .replaceAll("\\s", "")).collect(Collectors.toList());

        driver.findElements(Goods.addToBasket).stream().limit(num).forEach(this::checkForSize);
        return this;
    }

    private void checkForSize(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        element.click();
        try {
            WebElement sizeElement = wait.until(
                    ExpectedConditions.elementToBeClickable(Size.checkSize)
            );
            sizeElement.click();
        } catch (TimeoutException e) {
            System.out.println("Окно выбора размера не появилось, товар добавлен без выбора размера");
        }
        catch (NoSuchElementException ignored) {
            System.out.println("Элемент размера не найден");
        }
    }

    public Double getSelectedGoodsPrice(int index) {
        return Double.parseDouble(selectPrices.get(index));
    }

    public double getSumOfGoods() {
        return selectPrices.stream().mapToDouble(Double::parseDouble).sum();
    }

    public int getCountOfGoods() {
        return selectGoods.size();
    }

    public String getSelectedGoodsName(int index) {
        return selectGoods.get(index);
    }
}