package TestNg_Listener_class;

import org.testng.*;

/**
 * Created by DELL on 2019/6/17.
 */
public class CustomListener implements IInvokedMethodListener,ITestListener,ISuiteListener {
    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
//		在测试类里的每一个方法运行之前跑
        System.out.println("Before Invocation:"+testResult.getTestClass().getName()+" -->"+
                method.getTestMethod().getMethodName());
    }
    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
//		在测试类里的每一个方法运行之后跑
        System.out.println("After Invocation:"+testResult.getTestClass().getName()+" -->"+
                method.getTestMethod().getMethodName());
    }
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
    @Override
    public void onStart(ISuite arg0) {
//		当suite标签开始执行时
        System.out.println("onStart：suite开始执行之前");
    }

    @Override
    public void onFinish(ISuite arg0) {
//		当suite标签执行完后
        System.out.println("onFinish：suite执行完之后");
    }

}