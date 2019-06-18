package TestNg_Asserts;

import org.testng.annotations.Test;

/**
 * Created by DELL on 2019/6/17.
 */
public class TestAnnotation {

    @Test
    public void testMethod2() {
        System.out.println("这是第二个测试方法");
    }
    @Test
    public void atestMethod3() {
        System.out.println("这是第三个测试方法");
    }
    @Test
    public void testMethod1() {
        ClassToBeTested test = new ClassToBeTested();
        int result = test.addNum(2, 3);
        System.out.println("这是第一个测试方法..."+result);
    }
}
