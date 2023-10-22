package myOrg.com;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AppTest {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
        driver.get("https://www.mts.by/");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testContinueButton() {
        driver.findElement(By.xpath("//button[@class='select__header']")).click();
        driver.findElement(By.xpath("//p[@class='select__option'][1]")).click();
        WebElement phoneField = driver.findElement(By.id("connection-phone"));
        phoneField.click();
        phoneField.sendKeys("297777777");
        WebElement amount = driver.findElement(By.id("connection-sum"));
        amount.click();
        amount.sendKeys("123");
        WebElement continueButton = driver.findElement(By.xpath("//form[@id='pay-connection']/button[@type='submit'][1]"));
        continueButton.click();

        Set<Cookie> cookies = driver.manage().getCookies();
        cookies.forEach(c -> driver.manage().addCookie(c));
        WebDriver iFrame = wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@class='bepaid-iframe']")));

        List<WebElement> elements = new WebDriverWait(iFrame, 10)
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='header__payment']/p")));
        WebElement button = new WebDriverWait(iFrame, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='card-page__card']/button")));

        assertAll(() -> assertEquals("123.00 BYN", elements.get(0).getText()),
                () -> assertEquals("Оплата: Услуги связи Номер:375297777777", elements.get(1).getText()),
                () -> assertEquals("Оплатить 123.00 BYN", button.getText()));
    }
}