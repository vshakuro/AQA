package myOrg.com;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

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
    void checkBlockNameTest() {
        List<WebElement> elements = driver.findElements(By.xpath("//section/div/h2"));
        String actual = elements.stream().map(WebElement::getText).collect(Collectors.joining());
        String expected = "Онлайн пополнение\n".concat("без комиссии");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findLogoPaySysTest() {
        List<WebElement> icons = driver.findElements(By.xpath("//div[@class='pay__partners']/ul/li/img"));
        assertAll(() -> assertTrue(icons.get(0).isDisplayed()),
                () -> assertTrue(icons.get(1).isDisplayed()),
                () -> assertTrue(icons.get(2).isDisplayed()),
                () -> assertTrue(icons.get(3).isDisplayed()),
                () -> assertTrue(icons.get(4).isDisplayed()),
                () -> assertTrue(icons.get(5).isDisplayed()));
    }

    @Test
    public void testMoreInfoLink() {
        WebElement link = driver.findElement(By.xpath("//div[@class='pay__wrapper']/a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(link).click().perform();
        String url = driver.getCurrentUrl();
        Assertions.assertEquals("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/", url);
    }

    @Test
    public void testContinueButton() {
        driver.findElement(By.xpath("//button[@class='select__header']")).click();
        driver.findElement(By.xpath("//p[@class='select__option'][1]")).click();
        WebElement phoneField = driver.findElement(By.id("connection-phone"));
        phoneField.click();
        phoneField.sendKeys("297777777");
        WebElement continueButton = driver.findElement(By.xpath("//form[@id='pay-connection']/button[@type='submit'][1]"));
        continueButton.click();
    }
}