package TestNg_Listener;

import org.testng.ISuite;
import org.testng.ISuiteListener;

/**
 * Created by DELL on 2019/6/17.
 */
public class CustomListener3 implements ISuiteListener {
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
