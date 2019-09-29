import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Actions;

import java.util.List;


public class WomenShop {




    @Test
    public void WomenShopTest () {
        System.setProperty("webdriver.gecko.driver", "/Users/nadia/Downloads/geckodriver"); //прописываем путь
        WebDriver driver = new FirefoxDriver(); //открываем новое окно
        driver.get("http://www.automationpractice.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("WOMEN")).click();
        String firstElementLeftList = driver.findElement(By.cssSelector("div#categories_block_left > div >ul >li >a")).getText();
        String secondElementLeftList = driver.findElement(By.cssSelector("div#categories_block_left > div >ul >li:nth-of-type(2) >a")).getText();
        String firstElementBottom = driver.findElement(By.cssSelector("div#subcategories > ul > li > h5 > a")).getText();
        String secondElementBottom = driver.findElement(By.cssSelector("div#subcategories > ul > li:nth-child(2) > h5 > a")).getText();
        //List<WebElement> elements = driver.findElements(By.className("tree dynamized"));
        //for(WebElement e : elements) {
        System.out.println(firstElementLeftList);
        System.out.println(secondElementLeftList);
        System.out.println(firstElementBottom);
        System.out.println(secondElementBottom);
        Assertions.assertEquals(firstElementLeftList, firstElementBottom);

        // }
        driver.close();
        //pervyjElementLevogoSpiska

        //WebElement element = driver.findElement(By.tagName("women"));

    }
}
