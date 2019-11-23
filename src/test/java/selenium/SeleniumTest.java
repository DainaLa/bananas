package selenium;

import org.jetbrains.annotations.TestOnly;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.core.Is.is;

public class SeleniumTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\IdeaProjects\\Pagrindinis\\src\\test\\resources\\driver\\chromedriver");
        driver = new ChromeDriver();
    }

            @Test
            public void testTodeysDate() {
                driver.get("https://www.delfi.lt");

                WebElement title = driver.findElement(By.className("header-data"));
                Assert.assertThat(title.getText(), is("Lapkricio 17 d., sekmadienis"));
                driver.close();

            }
        }

