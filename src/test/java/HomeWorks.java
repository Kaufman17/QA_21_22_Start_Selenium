import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;


public class HomeWorks {

    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void cssLocators() {
        //by tag name
        WebElement e1 = wd.findElement(By.tagName("body"));
        WebElement elBody = wd.findElement(By.cssSelector("body"));

        WebElement e2 = wd.findElement(By.tagName("div"));
        WebElement elDiv = wd.findElement(By.cssSelector("div"));

        WebElement e3 = wd.findElement(By.tagName("h1"));
        WebElement elH1 = wd.findElement(By.cssSelector("h1"));

        List<WebElement> list = wd.findElements(By.tagName("a"));

        WebElement e4 = wd.findElement(By.tagName("button"));
        WebElement elButton = wd.findElement(By.cssSelector("button"));
        WebElement xEl = wd.findElement(By.xpath("//button"));
        // WebElement xEl1 = wd.findElement(By.xpath("/html/body/div/div/div/form/button"));

        WebElement e6 = wd.findElement(By.tagName("form"));
        WebElement elForm = wd.findElement(By.cssSelector("form"));


        //by class

        WebElement divcontainer = wd.findElement(By.className("container"));
        WebElement divcontainer1 = wd.findElement(By.cssSelector(".container"));
        WebElement wel7 = wd.findElement(By.xpath("//*[@class='container']"));

        WebElement navBar = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement navBar1 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));

        WebElement active = wd.findElement(By.className("active"));
        WebElement active1 = wd.findElement(By.cssSelector(".active"));

        WebElement login = wd.findElement(By.className("login_login__3EHKB"));
        WebElement login1 = wd.findElement(By.cssSelector(".login_login__3EHKB"));


        //by id

        WebElement root = wd.findElement(By.id("root"));
        WebElement root1 = wd.findElement(By.cssSelector("#root"));
        WebElement xEl11 = wd.findElement(By.xpath("//*[@id='root']"));

        //by attribute


        WebElement hrefHome = wd.findElement(By.cssSelector("[href='/home']"));
        WebElement hrefAbout = wd.findElement(By.cssSelector("[href='/about']"));
        WebElement hrefLogin = wd.findElement(By.cssSelector("[href='/login']"));
        WebElement ariaCurrent = wd.findElement(By.cssSelector("[aria-current='page']"));

        WebElement inputNameEmail = wd.findElement(By.cssSelector("[name='email']"));
        WebElement inputNamePas = wd.findElement(By.cssSelector("[name='password']"));

        WebElement inputEmail = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement inputPassword = wd.findElement(By.cssSelector("[placeholder='Password']"));

        WebElement typeLog = wd.findElement(By.cssSelector("[type='submit']"));
        WebElement typeLogNam = wd.findElement(By.cssSelector("[name='login']"));
        WebElement typeLogReg = wd.findElement(By.cssSelector("[name='registration']"));


        //one of elements find by attribute ==> start& end & contains value
        WebElement el18 = wd.findElement(By.cssSelector("[placeholder = 'Email']"));
        WebElement xEl18 = wd.findElement(By.xpath("//input [@placeholder='Email']"));

        WebElement el19 = wd.findElement(By.cssSelector("[placeholder ^= 'Em']"));
        WebElement xEl19 = wd.findElement(By.xpath("//input [starts-with(@placeholder, 'Em')]"));

        WebElement el20 = wd.findElement(By.cssSelector("[placeholder $= 'il']"));
        WebElement xEl20 = wd.findElement(By.xpath("//input [contains(@placeholder, 'il')]"));
        WebElement el21 = wd.findElement(By.cssSelector("[placeholder *= 'ma']"));
        WebElement xEl21 = wd.findElement(By.xpath("//input [contains(@placeholder, 'ma')]"));

    }


    @AfterClass
    public void closeWd() {
        wd.close();

    }

}
