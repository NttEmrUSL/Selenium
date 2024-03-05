package Testng.day35;

import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

    @Test
    void test()
    {
       // int x = 10;
       // int y = 10;

       // Assert.assertEquals(x,y);

       // Assert.assertTrue(true); // pass
       // Assert.assertTrue(false); // fail

        int a = 10;
        int b = 20;

        // Assert.assertEquals(actual, expected, descriotion)
        //Assert.assertEquals(a>b, true, "a is not greater than b"); // false

        String s1 = "abc";
        String s2 = "abc";

        //Assert.assertEquals(s1,s2,"Strings are not equal"); // pass
        //Assert.assertNotEquals(s1,s2); // fail

        if(false)
        {
            Assert.assertTrue(true);
        } else
        {
           // Assert.assertTrue(false);
            Assert.fail();
        }

    }
}
