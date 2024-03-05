package Testng.day35.Package;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class2 {

    @Test
    void xyz()
    {
        System.out.println("This is xyz from class 2");
    }

    @AfterTest
    void n()
    {
        System.out.println("This is after test method");
    }
}
