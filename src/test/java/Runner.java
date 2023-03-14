
import org.testng.Assert;
import org.testng.annotations.Test;

public class Runner extends Setup {
    Elem elem = new Elem(driver);

    @Test
    public void deletemail() throws InterruptedException {
        elem = new Elem(driver);
        driver.get("https://mail.google.com/mail/u/0/#inbox");
        Thread.sleep(3000);
        elem.login();
        elem.checkbin();
        if(elem.flag){
            String actual_msg = elem.nomsg.getText();
            Assert.assertEquals(actual_msg,("No conversations in Bin."));
            System.out.println("NO message to delete\n");
        }
        else
        {
           while(elem.flag)
           {
                elem.delete();
            }
        }
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("trash"));
        System.out.println("Passed");
    }
}
