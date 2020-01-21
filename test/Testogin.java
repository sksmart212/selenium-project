package test;
import nopCommerce.CommerceWebPages.Login;
import org.junit.Test;

public class Testogin {
    @Test
    public void TestLogin()
    {
        Login user= new Login();
        user.LoginUser();
        user.NavigateNotebooks();
        user.SortNotebooks();


    }
}
