package TestNG_ITestResult;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 * Created by DELL on 2019/6/17.
 * ITestResult对结果进行判断，ITestResult方法可以对@Test方法进行监听
 */
public class TestNG_ITestResultDemo {

    @Test
    public void testMethod1() {
        System.out.println("Running -> testMethod1");
        Assert.assertTrue(false);
    }

    @Test
    public void testMethod2() {
        System.out.println("Running -> testMethod2");
        Assert.assertTrue(true);
    }

    @AfterMethod
    public void afterMethod(ITestResult testResult) {
        if(testResult.getStatus()==ITestResult.FAILURE){
            System.out.println("Failed:"+testResult.getMethod().getMethodName());
        }

        if(testResult.getStatus()==ITestResult.SUCCESS){
            System.out.println("Successful:"+testResult.getName());
        }
    }
}
