import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elem {
    @FindBy(css =".Bn")
    WebElement delete;

    @FindBy(css =".T-Jo.J-J5-Ji.T-Jo-auq.T-Jo-Jp")
    WebElement checkbox;

    public Elem(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void delete() throws InterruptedException {
        checkbox.click();
        Thread.sleep(5000);
        delete.click();
    }

}
