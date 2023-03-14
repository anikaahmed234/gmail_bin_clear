
import org.testng.Assert;
import org.testng.annotations.Test;

public class Runner extends Setup {
    Elem elem = new Elem(driver);

    @Test
    public void deletemail() throws InterruptedException {
        elem = new Elem(driver);
        driver.get("https://mail.google.com/mail/u/0/#inbox");
        Thread.sleep(15000);
//        for (int i = 0; i < 5; i++) {
//            elem.delete();
//        }
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("trash"));
        System.out.println("Passed\n");
    }
}
