import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elem {
    @FindBy(css =".Bn")
    WebElement delete;

    @FindBy(css =".T-Jo.J-J5-Ji.T-Jo-auq.T-Jo-Jp")
    WebElement checkbox;

    @FindBy(css =".whsOnd.zHQkBf")
    WebElement email;

    @FindBy(css =".whsOnd.zHQkBf")
    WebElement pwd;

    @FindBy(xpath = "//span[contains(text(), 'Next')]")
    WebElement nextbtn;

    @FindBy(css =".CJ")
    WebElement more;

    @FindBy(css =".aio.UKr6le")
    WebElement bin;

    @FindBy(xpath = "//span[contains(text(), 'No conversations in Bin.')]")
    WebElement nomsg;
    boolean flag;
    public Elem(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void nomsgcheck(){
        String actual_msg = nomsg.getText();
        flag = actual_msg.equals("No conversations in Bin.");
    }
    public void login() throws InterruptedException {
        email.sendKeys("testdemo1@gmail.com");
        nextbtn.click();
        Thread.sleep(3000);
        pwd.sendKeys("_Hj24msfj93");
        nextbtn.click();
    }
    public boolean checkbin(){
        more.click();
        bin.click();

        nomsgcheck();
        return flag;
    }

    public boolean delete() throws InterruptedException {

        checkbox.click();
        delete.click();
        Thread.sleep(10000);

        nomsgcheck();
        return flag;

    }
}
