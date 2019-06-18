package TestNg_Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

/**
 * Created by DELL on 2019/6/17.
 */
public class CustomListener2 implements ITestListener {
    @Override
    public void onTestStart(ITestResult arg0) {
//		测试方法开始时才执行此方法
        System.out.println("onTestStart-> test name:"+arg0.getName());
    }

    @Override
    public void onTestSuccess(ITestResult arg0) {
//		如果测试方法执行成功才执行此方法
        System.out.println("onTestSuccess-> test name:"+arg0.getName());
    }

    @Override
    public void onTestFailure(ITestResult arg0) {
//		如果测试方法执行失败才执行此方法
        System.out.println("onTestFailure-> test name:"+arg0.getName());
    }

    @Override
    public void onTestSkipped(ITestResult arg0) {
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
//		忽略
    }

    @Override
    public void onStart(ITestContext arg0) {
//		在XML文件的test标签执行之前运行
        System.out.println("onStart-> test tag name:"+arg0.getName());
        ITestNGMethod methods[] = arg0.getAllTestMethods();
        System.out.println("Test标签里面要执行的测试方法");
        for(ITestNGMethod method:methods){
            System.out.println(method.getMethodName());
        }
    }

    @Override
    public void onFinish(ITestContext arg0) {
//		在XML文件的test标签执行之后运行
        System.out.println("onFinish-> test tag name:"+arg0.getName());
    }

}
