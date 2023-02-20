import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class InputsTest extends BaseTest {
    @Test
    public void inputs() {
        driver.get("http://the-internet.herokuapp.com/inputs");
        WebElement element = driver.findElement(By.tagName("input"));
        element.sendKeys("10");
        element.sendKeys(Keys.ARROW_UP);
        String number1 = element.getAttribute("value");
        assertEquals(number1, "11", "Error");
        element.sendKeys(Keys.ARROW_DOWN);
        String number2 = element.getAttribute("value");
        assertEquals(number2, "10", "Error");

    }
}
