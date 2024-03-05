package Testng.day35;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardvsSoftAssertions {

    //@Test
    void test_hardassertions()
    {
        System.out.println("testing...");
        System.out.println("testing...");
        System.out.println("testing...");
        System.out.println("testing...");
        System.out.println("testing...");

        Assert.assertEquals(1,2); // if it will fail then below statement will not be executed

        System.out.println("Hard assertion completed...");

        Assert.assertEquals(1,1);
    }

    @Test
    void test_softassertions()
    {
        System.out.println("testing...");
        System.out.println("testing...");
        System.out.println("testing...");
        System.out.println("testing...");
        System.out.println("testing...");

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(1,2);

        System.out.println("Soft assertion completed...");

        softAssert.assertAll(); // mandatory
    }
}
