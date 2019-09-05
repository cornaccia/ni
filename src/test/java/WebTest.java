import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTest {
    @Test
    public void delfiFirstTitleTest () {
        System.setProperty("webdriver.gecko.driver", "/Users/nadia/Downloads/geckodriver"); //прописываем настройку
        WebDriver driver = new FirefoxDriver(); //открываем новое окно
        driver.manage().window().maximize(); // расширяем на окно
        driver.get("http://www.delfi.lv/"); // фунция get которая перекидывает на сайт



    }
}
