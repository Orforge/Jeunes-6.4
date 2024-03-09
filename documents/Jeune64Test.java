// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class Jeune64Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  public String waitForWindow(int timeout) {
    try {
      Thread.sleep(timeout);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Set<String> whNow = driver.getWindowHandles();
    Set<String> whThen = (Set<String>) vars.get("window_handles");
    if (whNow.size() > whThen.size()) {
      whNow.removeAll(whThen);
    }
    return whNow.iterator().next();
  }
  @Test
  public void jeune64() {
    driver.get("http://localhost:8080/jeune6.4.html");
    driver.manage().window().setSize(new Dimension(1440, 873));
    driver.findElement(By.linkText("ENTRER")).click();
    driver.findElement(By.linkText("PARTENAIRES")).click();
    driver.findElement(By.linkText("CONSULTANT")).click();
    driver.findElement(By.linkText("RÉFÉRENT")).click();
    driver.findElement(By.linkText("JEUNE")).click();
    driver.findElement(By.linkText("Créer un compte")).click();
    driver.findElement(By.cssSelector(".container:nth-child(4)")).click();
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).sendKeys("selenium");
    driver.findElement(By.cssSelector("form")).click();
    driver.findElement(By.name("firstname")).click();
    driver.findElement(By.name("firstname")).sendKeys("selenium");
    driver.findElement(By.cssSelector("form")).click();
    driver.findElement(By.name("birth")).click();
    driver.findElement(By.name("birth")).sendKeys("0002-01-01");
    driver.findElement(By.name("birth")).sendKeys("0020-01-01");
    driver.findElement(By.name("birth")).sendKeys("0200-01-01");
    driver.findElement(By.name("birth")).sendKeys("2000-01-01");
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).sendKeys("selenium@selenium");
    driver.findElement(By.cssSelector("form")).click();
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).sendKeys("selenium");
    driver.findElement(By.cssSelector("form")).click();
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).sendKeys("selenium");
    driver.findElement(By.cssSelector(".confirm")).click();
    driver.findElement(By.linkText("PARTENAIRES")).click();
    driver.findElement(By.linkText("CONSULTANT")).click();
    driver.findElement(By.linkText("RÉFÉRENT")).click();
    driver.findElement(By.linkText("JEUNE")).click();
    driver.findElement(By.cssSelector("#nav-open > .md")).click();
    driver.findElement(By.name("newExperience")).click();
    driver.findElement(By.name("description")).click();
    driver.findElement(By.name("description")).sendKeys("selenium");
    driver.findElement(By.name("environement")).click();
    driver.findElement(By.name("environement")).sendKeys("selenium");
    driver.findElement(By.name("beginning")).click();
    driver.findElement(By.name("beginning")).sendKeys("0002-01-01");
    driver.findElement(By.name("beginning")).sendKeys("0020-01-01");
    driver.findElement(By.name("beginning")).sendKeys("0200-01-01");
    driver.findElement(By.name("beginning")).sendKeys("2000-01-01");
    driver.findElement(By.cssSelector(".description tr:nth-child(4) > td:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".description")).click();
    driver.findElement(By.name("duration")).click();
    driver.findElement(By.name("duration")).sendKeys("1");
    driver.findElement(By.cssSelector("tr:nth-child(1) > td:nth-child(1) > .container")).click();
    driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(1) > .container")).click();
    driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(2) > .container")).click();
    driver.findElement(By.cssSelector("#savoir_etre > tr:nth-child(1) > td:nth-child(2)")).click();
    driver.findElement(By.cssSelector("tr:nth-child(1) > td:nth-child(2) > .container")).click();
    driver.findElement(By.name("myTable[]")).click();
    driver.findElement(By.name("myTable[]")).sendKeys("selenium1");
    driver.findElement(By.cssSelector("input:nth-child(3)")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("input:nth-child(3)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(1) > .long")).click();
    driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(1) > .long")).sendKeys("selenium2");
    driver.findElement(By.cssSelector("input:nth-child(3)")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("input:nth-child(3)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector("tr:nth-child(3) .long")).click();
    driver.findElement(By.cssSelector("tr:nth-child(3) .long")).sendKeys("selenium3");
    driver.findElement(By.cssSelector("input:nth-child(3)")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("input:nth-child(3)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector("tr:nth-child(4) .long")).click();
    driver.findElement(By.cssSelector("tr:nth-child(4) .long")).sendKeys("selenium4");
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).sendKeys("selenium");
    driver.findElement(By.name("firstname")).click();
    driver.findElement(By.name("firstname")).sendKeys("selenium");
    driver.findElement(By.name("email")).sendKeys("selenium@selenium");
    driver.findElement(By.name("situation")).sendKeys("selenium");
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.cssSelector(".confirm")).click();
    vars.put("win6675", waitForWindow(2000));
    vars.put("root", driver.getWindowHandle());
    driver.switchTo().window(vars.get("win6675").toString());
    driver.findElement(By.cssSelector("main")).click();
    driver.findElement(By.cssSelector("#nav-open > .md")).click();
    driver.findElement(By.name("account")).click();
    driver.findElement(By.cssSelector(".container:nth-child(2)")).click();
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).sendKeys("selenium1");
    driver.findElement(By.name("firstname")).click();
    driver.findElement(By.name("firstname")).sendKeys("selenium1");
    driver.findElement(By.cssSelector(".confirm")).click();
    driver.switchTo().window(vars.get("root").toString());
    driver.findElement(By.linkText("confirmer une experience")).click();
    driver.findElement(By.cssSelector("tr:nth-child(1) > td:nth-child(1) > .container")).click();
    driver.findElement(By.cssSelector("#savoir_etre > tr:nth-child(2) > td:nth-child(1)")).click();
    driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(1) > .container")).click();
    driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(2) > .container")).click();
    driver.findElement(By.cssSelector("tr:nth-child(1) > td:nth-child(2) > .container")).click();
    driver.findElement(By.name("myTable[]")).click();
    driver.findElement(By.name("myTable[]")).sendKeys("selenium1 bis");
    driver.findElement(By.cssSelector("input:nth-child(4)")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("input:nth-child(4)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(1) > .long")).click();
    driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(1) > .long")).sendKeys("selenium2 bis");
    driver.findElement(By.cssSelector("input:nth-child(4)")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("input:nth-child(4)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector("tr:nth-child(3) .long")).click();
    driver.findElement(By.cssSelector("tr:nth-child(3) .long")).sendKeys("selenium3 bis");
    driver.findElement(By.cssSelector("input:nth-child(4)")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("input:nth-child(4)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector("tr:nth-child(4) .long")).click();
    driver.findElement(By.cssSelector("tr:nth-child(4) .long")).sendKeys("selenium4 bis");
    driver.findElement(By.name("comment")).click();
    driver.findElement(By.name("comment")).sendKeys("selenium lorem ipsum");
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.cssSelector(".confirm")).click();
    vars.put("win200", waitForWindow(2000));
    driver.switchTo().window(vars.get("win200").toString());
    driver.switchTo().window(vars.get("root").toString());
    driver.findElement(By.linkText("Me connecter")).click();
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).sendKeys("selenium");
    driver.findElement(By.name("password")).sendKeys("selenium");
    driver.findElement(By.cssSelector("button")).click();
    driver.findElement(By.cssSelector("#nav-open > .md")).click();
    driver.findElement(By.name("select")).click();
    driver.findElement(By.name("skills[]")).click();
    driver.findElement(By.xpath("//label[contains(.,\'Générer un CV\')]")).click();
    driver.findElement(By.xpath("//label[contains(.,\'format pdf\')]")).click();
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.name("select")).click();
    vars.put("win2060", waitForWindow(2000));
    driver.switchTo().window(vars.get("win2060").toString());
    driver.switchTo().window(vars.get("root").toString());
    driver.findElement(By.cssSelector("button:nth-child(10)")).click();
    driver.findElement(By.xpath("//label[contains(.,\'Envoyer à un consultant\')]")).click();
    driver.findElement(By.xpath("//label[contains(.,\'se référer à la sélection ci-dessus\')]")).click();
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).sendKeys("selenium@selenium");
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.name("select")).click();
    vars.put("win9653", waitForWindow(2000));
    driver.switchTo().window(vars.get("win9653").toString());
    driver.switchTo().window(vars.get("root").toString());
    driver.findElement(By.linkText("consulter les experiences")).click();
    driver.findElement(By.name("deconnexion")).click();
    driver.findElement(By.linkText("JEUNE")).click();
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).sendKeys("admin");
    driver.findElement(By.cssSelector("button")).click();
    driver.findElement(By.name("username2")).click();
    driver.findElement(By.name("username2")).sendKeys("cytech");
    driver.findElement(By.name("password2")).click();
    driver.findElement(By.name("password2")).sendKeys("shellshocker.io");
    driver.findElement(By.cssSelector("button")).click();
    driver.findElement(By.linkText("selenium")).click();
    driver.findElement(By.cssSelector("#nav-open > .md")).click();
    driver.findElement(By.name("account")).click();
    driver.findElement(By.name("delete")).click();
    driver.findElement(By.name("delete")).click();
  }
}
