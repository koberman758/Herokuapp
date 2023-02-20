import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class DropdownTest extends BaseTest {
    @Test
    public void dropdown() {
        driver.get("http://the-internet.herokuapp.com/dropdown");
        List<WebElement> options = new Select(driver.findElement(By.id("dropdown"))).getOptions();
        String optionOne = options.get(0).getText();
        assertEquals(optionOne, "Please select an option", "Invalid element 1");
        String optionTwo = options.get(1).getText();
        assertEquals(optionTwo, "Option 1", "Invalid element 2");
        String optionThree = options.get(2).getText();
        assertEquals(optionThree, "Option 2", "Invalid element 3");
        Select dropdown = new Select(driver.findElement(By.id("dropdown")));
        dropdown.selectByVisibleText("Option 1");
        assertEquals(dropdown.getFirstSelectedOption().getText(), "Option 1", "Invalid option 1");
        dropdown.selectByVisibleText("Option 2");
        assertEquals(dropdown.getFirstSelectedOption().getText(), "Option 2", "Invalid option 2");

    }
}
