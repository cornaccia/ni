import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DelfiTest {
    private final By HOME_PAGE_TITLE = By.xpath(".//h1[contains(@class, 'text-size-22')]");
    private final By HOME_PAGE_COMMENTS = By.xpath(".//a[@class = 'comment-count text-red-ribbon']");

    @Test
    public void tittleAndCommentsTest () {

        //Open browser
        System.setProperty("webdriver.chrome.driver", "/Users/nadia/Downloads/chromedriver"); //прописываем путь
        WebDriver driver = new ChromeDriver(); //открываем новое окно
        driver.manage().window().maximize();
        //Open Delfi home page
        driver.get("http://rus.delfi.lv");
        //Find 1st article title
        WebElement homePageTitle = driver.findElement(HOME_PAGE_TITLE);

        //Save to String
        String titleToCompare = homePageTitle.getText();

        //Find Comments count
        WebElement homePageComments = driver.findElement(HOME_PAGE_COMMENTS);

        //Save to integer
        String commentsToParse = homePageComments.getText(); //(1)
        commentsToParse = commentsToParse.substring(1, commentsToParse.length() - 1);
        Integer commentsToCompare = Integer.valueOf(commentsToParse);

        //Open article page


        //Find Tittle
        //Check Tittle
        //Find comment count
        //Check comment count
        //Open comments page
        //Find title
        //Check tittle
        //get comment count
        //Check comment count
        //Close browser


            driver.close();

    }

}
