package TestNg_depends;

import org.junit.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

/**
 * Created by DELL on 2019/6/17.
 * dependsOnMethods设置依赖方法
 */
public class TestNG_DependentTests {
    ClassToBeTested obj;
    @BeforeClass
    public void setUp() {
        System.out.println("before class");
        obj = new ClassToBeTested();
    }

    @AfterClass
    public void cleanUp() {
        System.out.println("after class");
    }

    @Test(dependsOnMethods = {"testMethod2"},alwaysRun = true)
    public void testMethod1() {
        System.out.println("testMethod1");

    }

    @Test
    public void testMethod2() {
        System.out.println("testMethod2");
        int result = obj.addNum(1, 2);
        Assert.assertEquals(result, 2);
    }

    @Test(dependsOnMethods = {"testMethod1"})
    public void testMethod3() {
        System.out.println("testMethod3");
    }

    @Test
    public void testMethod4() {
        System.out.println("testMethod4");
    }
}
