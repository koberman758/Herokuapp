import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class TyposTest extends BaseTest {
    @Test
    public void typos() {
        driver.get("http://the-internet.herokuapp.com/typos");
        for (int i = 0; i < 10; i++) {
            driver.navigate().refresh();
            List<WebElement> typos = driver.findElements(By.tagName("p"));
            String accordance = typos.get(1).getText();
            assertEquals(accordance, "Sometimes you'll see a typo, other times you won,t.",
                    "typo in the word won,t");
        }
    }
}
