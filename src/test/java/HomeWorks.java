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
        WebElement xelBody = wd.findElement(By.xpath("//body"));

        WebElement e2 = wd.findElement(By.tagName("div"));
        WebElement elDiv = wd.findElement(By.cssSelector("div"));
        WebElement xelDiv = wd.findElement(By.xpath("//div"));

        WebElement e3 = wd.findElement(By.tagName("h1"));
        WebElement elH1 = wd.findElement(By.cssSelector("h1"));
        WebElement xelH1 = wd.findElement(By.xpath("//h1"));

        List<WebElement> list = wd.findElements(By.tagName("a"));
        List<WebElement> xlist = wd.findElements(By.xpath("//a"));

        WebElement e4 = wd.findElement(By.tagName("button"));
        WebElement elButton = wd.findElement(By.cssSelector("button"));
        WebElement xEl = wd.findElement(By.xpath("//button"));
        // WebElement xEl1 = wd.findElement(By.xpath("/html/body/div/div/div/form/button"));

        WebElement e6 = wd.findElement(By.tagName("form"));
        WebElement elForm = wd.findElement(By.cssSelector("form"));
        WebElement xelForm = wd.findElement(By.xpath("//form"));


        //by class

        WebElement divcontainer = wd.findElement(By.className("container"));
        WebElement divcontainer1 = wd.findElement(By.cssSelector(".container"));
        WebElement wel7 = wd.findElement(By.xpath("//*[@class='container']"));

        WebElement navBar = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement navBar1 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement xnavBar1 = wd.findElement(By.xpath("//*[@class='navbar-component_nav__1X_4m']"));

        WebElement active = wd.findElement(By.className("active"));
        WebElement active1 = wd.findElement(By.cssSelector(".active"));
        WebElement xactive1 = wd.findElement(By.xpath("//*[@class='active']"));

        WebElement login = wd.findElement(By.className("login_login__3EHKB"));
        WebElement login1 = wd.findElement(By.cssSelector(".login_login__3EHKB"));
        WebElement xlogin1 = wd.findElement(By.xpath("//*[@class='login_login__3EHKB']"));


        //by id

        WebElement root = wd.findElement(By.id("root"));
        WebElement root1 = wd.findElement(By.cssSelector("#root"));
        WebElement xEl11 = wd.findElement(By.xpath("//*[@id='root']"));

        //by attribute

        WebElement hrefHome = wd.findElement(By.cssSelector("[href='/home']"));
        WebElement xhrefHome = wd.findElement(By.xpath("//*[@href='/home']"));

        WebElement hrefAbout = wd.findElement(By.cssSelector("[href='/about']"));
        WebElement xhrefAbout = wd.findElement(By.xpath("//*[@href='/about']"));

        WebElement hrefLogin = wd.findElement(By.cssSelector("[href='/login']"));
        WebElement xhrefLogin = wd.findElement(By.xpath("//*[@href='/login']"));

        WebElement ariaCurrent = wd.findElement(By.cssSelector("[aria-current='page']"));
        WebElement xariaCurrent = wd.findElement(By.xpath("//*[@aria-current='page']"));

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

    @Test
    public void classwork() {
        //parent
        //WebElement el = wd.findElement(By.xpath("//div/div//input/.."));
        WebElement el1 = wd.findElement(By.xpath("//h1/parent::*"));
        WebElement el2 = wd.findElement(By.xpath("//h1/parent::div"));
        WebElement el3 = wd.findElement(By.xpath("//h1/.."));

        //ancestor
        WebElement el4 = wd.findElement(By.xpath("//h1/ancestor::*"));//all
        WebElement el5 = wd.findElement(By.xpath("//h1/ancestor::div"));//two options
        WebElement el6 = wd.findElement(By.xpath("//h1/ancestor::div[2]"));//one options

        //ancestor-or-self
        WebElement el7 = wd.findElement(By.xpath("//h1/ancestor-or-self::*"));//plus one more
        List<WebElement> list = wd.findElements(By.xpath("//h1/ancestor-or-self::*"));


        //folowing-sibling
        List<WebElement> list1 = wd.findElements(By.xpath("//h1/following-sibling::a"));

        //preceding-sibling
        WebElement el8 = wd.findElement(By.xpath("//a[@href='/login']/preceding-sibling::h1"));
        List<WebElement> list2 = wd.findElements(By.xpath("//a[@href='login']/preceding-sibling::a"));


    }
    @Test
    public void innerText() {
        WebElement element = wd.findElement(By.cssSelector("[name='login']"));
        String text = element.getText(); //get from innerText
        System.out.println(text);

        WebElement form = wd.findElement(By.xpath("//form"));
        String textForm = form.getText();

        System.out.println("*********************");
        System.out.println(textForm);

        WebElement html = wd.findElement(By.tagName("html"));
        String textAll = html.getText();
        System.out.println("*********************");
        System.out.println(textAll);

    }
    @AfterClass
    public void closeWd() {
        wd.close();

    }

}
