import org.testng.annotations.*;

public class Ex3 {
    @BeforeGroups(groups = "Smoke")
    public void beforeSmoke() {
        System.out.println("Before Smoke");
    }
    @Test(groups = {"Smoke"})
    public void testHomepageLoads() {
        System.out.println("homepage loading");
    }
    @Test(groups = {"Smoke"})
    public void testLoginPageVisible() {
        System.out.println("login page visible");
    }
    @Test(groups = {"Smoke"})
    public void testFooterLinks() {
        System.out.println("test footer links");
    }
    @AfterGroups(groups = "Smoke")
    public void afterSmoke() {
        System.out.println("After Smoke");
    }




    @BeforeGroups(groups = "Regression")
    public void beforeRegression() {
        System.out.println("Before Regression");
    }
    @Test(groups = {"Regression"})
    public void testLoginValidCreds() {
        System.out.println("Test login valid");
    }
    @Test(groups={"Regression"})
    public void testLoginInvalidCreds() {
        System.out.println("Test login invalid");
    }
    @Test(groups = {"Regression"})
    public void testPasswordReset() {
        System.out.println("Test password reset");
    }
    @Test(groups = {"Regression"})
    public void testAccountBalance() {
        System.out.println("test account balance");
    }
    @AfterGroups(groups = "Regression")
    public void afterRegression() {
        System.out.println("After Regression");
    }
}