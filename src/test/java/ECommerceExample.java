import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ECommerceExample{


    @BeforeTest
    public void openWebSite() {
        System.out.println("HOME PAGE");
    }


    @Test(priority = 1)
    public void signUp() {
        System.out.println("After signup");
    }

    @Test(priority = 2)
    public void logIn() {
        System.out.println("After login");
    }

    @Test(priority = 3)
    public void addToCart() {
        System.out.println("Add product to cart");
    }

    @AfterTest
    public void logOut() {
        System.out.println("Log out");
    }
}
