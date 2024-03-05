package Testng.day35;

import org.testng.annotations.*;

public class AnnotationsClass {

    @BeforeClass
    void login()
    {
        System.out.println("Login...");
    }

    @Test(priority = 1)
    void search()
    {
        System.out.println("Search...");
    }

    @Test(priority = 2)
    void advancedSearch()
    {
        System.out.println("Advanced search...");
    }

    @AfterClass
    void logout()
    {
        System.out.println("Logout...");
    }
}
