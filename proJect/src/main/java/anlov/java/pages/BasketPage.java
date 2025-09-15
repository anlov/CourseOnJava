package anlov.java.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.stream.Collectors;

public class BasketPage extends BasePage{
    private List<String> goodsOfBucket;
    private List<String> pricesOfBucketGoods;
    private static class Result {
        private static final By summa = By.xpath("//span[text()='Итого']/following-sibling::span/span");
    }

    public BasketPage(WebDriver driver) {
        super(driver);
    }

    private static class Good {
        private static final By goodName = By.xpath("//span[@class='good-info__good-name']");
        private static final By goodPrice = By.xpath("//div[@class='list-item__price-new wallet']");
    }

    public void nameOfGoods() {
        goodsOfBucket = driver.findElements(Good.goodName).stream()
                .map(WebElement::getText).collect(Collectors.toList());
        pricesOfBucketGoods = driver.findElements(Good.goodPrice).stream()
                .map(p -> p.getText().split("₽")[0].replaceAll("\\s", ""))
                .collect(Collectors.toList());
    }

    public double getGoodsPrice(int index) {
        if (pricesOfBucketGoods == null || pricesOfBucketGoods.isEmpty()) {
            throw new RuntimeException("Список цен в корзине пустой! Проверьте, что товары добавлены в корзину");
        }
        if (index < 0 || index >= pricesOfBucketGoods.size()) {
            throw new RuntimeException("Индекс " + index + " выходит за границы списка цен. Размер списка: " + pricesOfBucketGoods.size());
        }
        return Double.parseDouble(pricesOfBucketGoods.get(index));
    }

    public int getCountOfGoods() {
        return goodsOfBucket.size();
    }

    public String getGoodsName(int index) {
        return goodsOfBucket.get(index);
    }

    public double getSum() {
        return Double.parseDouble(driver.findElement(Result.summa)
                .getText().split("₽")[0].replaceAll("\\s", ""));
    }

    public BasketPage wait(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return this;
    }
}