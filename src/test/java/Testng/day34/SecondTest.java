package Testng.day34;

import org.testng.annotations.Test;

public class SecondTest {

    @Test(priority = 1)
    void test1() {
        System.out.println("test1");
    }

    @Test(priority = 2)
    void test2() {
        System.out.println("test2");
    }

    @Test(priority = 3)
    void test3() {
        System.out.println("test3");
    }

}
