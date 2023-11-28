import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTests {
    WebDriver wd;
@BeforeClass
public void preCondition(){
    //open browser
    wd = new ChromeDriver();
    //open site
    wd.get("https://telranedu.web.app/home");
}
@Test
public void LoginSuccess(){
    //open form (find element + click)
    //fill email (find element + click + clean+ type)
    //fill password (find element + click + clean+ type)
    //submit form (find element + click)

}
@Test
    public void LoginWrongEmail(){
        //open form
        //fill form
        //submit form

    }
    @Test
    public void LoginWrongPassword(){
        //open form
        //fill form
        //submit form

    }

    @AfterClass
public void postCondition(){
//close browser
        wd.close();

}


}
