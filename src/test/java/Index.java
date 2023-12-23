import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.List;

public class Index {

    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("file:///C:/Users/IMOE001/Downloads/21.index.html");
    }

    @Test
    public void tableTest() {
        //Canada
        WebElement canada = wd.findElement(By.cssSelector("tr:nth-child(3)>td:last-child"));
        WebElement canada1 = wd.findElement(By.xpath("//td[text()='Canada']"));
        Assert.assertEquals(canada.getText(), "Canada");
    }

    @Test
    public void cssLocators() {
        //by tag name
        WebElement e1 = wd.findElement(By.tagName("button"));
        WebElement element = wd.findElement(By.cssSelector("button"));

        List<WebElement> list = wd.findElements(By.tagName("a"));
        int i = list.size();
        WebElement el3 = list.get(2);
        WebElement inputS = wd.findElement(By.name("name"));

        //by class
        WebElement divcontainer = wd.findElement(By.className("container"));
        WebElement divcontainer1 = wd.findElement(By.cssSelector(".container"));

        List<WebElement> navlist = wd.findElements(By.className("nav-item"));
        List<WebElement> navlist1 = wd.findElements(By.cssSelector(".nav-item"));


        //by id

        WebElement nav = wd.findElement(By.id("nav"));
        WebElement nav1 = wd.findElement(By.cssSelector("#nav"));

        //by attribute

        WebElement inputEmail = wd.findElement(By.cssSelector("[placeholder='Type your name']"));
        WebElement a2 = wd.findElement(By.cssSelector("[href='#item2']"));

        WebElement input1 = wd.findElement(By.cssSelector("[name='name']"));
        WebElement input2 = wd.findElement(By.name("name"));

        //By.linkText By.partiaLinkText
        WebElement el18 = wd.findElement(By.linkText("Item 1"));
        WebElement el19 = wd.findElement(By.partialLinkText("m 1"));


        WebElement inp = wd.findElement(By.cssSelector("[placeholder = 'Type your name']"));
        //start
        WebElement inp1 = wd.findElement(By.cssSelector("[placeholder^='Type']"));
        //end
        WebElement inp2 = wd.findElement(By.cssSelector("[placeholder$='name']"));
        //contains
        WebElement inp3 = wd.findElement(By.cssSelector("[placeholder*='your']"));

    }

}
