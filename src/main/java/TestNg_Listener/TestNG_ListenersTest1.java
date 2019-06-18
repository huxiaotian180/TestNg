package TestNg_Listener;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by DELL on 2019/6/17.
 */
public class TestNG_ListenersTest1 {

    @BeforeClass
    public void setUp() {
        System.out.println("Code in before class");
    }

    @AfterClass
    public void cleanUp() {
        System.out.println("Code in after class");
    }

    @Test
    public void testMethod1() {
        System.out.println("TestNG_ListenersTest2:Code in testMethod1");
        Assert.assertTrue(true);
    }

    @Test
    public void testMethod2() {
        System.out.println("TestNG_ListenersTest2:Code in testMethod2");
        Assert.assertTrue(false);
    }
}
