package Testng.day36;

import org.testng.annotations.Test;

public class Grouping {

    @Test(priority = 1, groups = {"sanity","regression"})
    void loginByEmail()
    {
        System.out.println("This is login by email");
    }

    @Test(priority = 2, groups = {"sanity"})
    void loginByFacebook()
    {
        System.out.println("This is login by facebook");
    }

    @Test(priority = 3, groups = {"sanity"})
    void loginByTwitter()
    {
        System.out.println("This is login by twitter");
    }

    @Test(priority = 4, groups = {"sanity","regression"})
    void signUpByEmail()
    {
        System.out.println("Signup by email");
    }

    @Test(priority = 5, groups = {"regression"})
    void signUpByFacebook()
    {
        System.out.println("Signup by facebook");
    }

    @Test(priority = 6, groups = {"regression"})
    void signUpByTwitter()
    {
        System.out.println("Signup by twitter");
    }

    @Test(priority = 7, groups = {"sanity","regression"})
    void paymentInDollar()
    {
        System.out.println("This is payment by dollar method");
    }

    @Test(priority = 8, groups = {"sanity"})
    void paymentInRupees()
    {
        System.out.println("This is payment by rupees model");
    }

    @Test(priority = 9, groups = {"regression"})
    void paymentReturnByBank()
    {
        System.out.println("Payment return by bank");
    }

}
