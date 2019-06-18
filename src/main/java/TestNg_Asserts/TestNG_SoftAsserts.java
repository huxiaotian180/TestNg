package TestNg_Asserts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * Created by DELL on 2019/6/17.
 */
public class TestNG_SoftAsserts {
    /**
     1.硬断言如果第一个断言失败了，下面的断言就不会执行了
     2.软断言
     assertAll执行测试方法中所有的断言，所有断言都成功，该案例才是成功
     SoftAssert则执行所有方法，只要有一个成功，案例就是成功的
     3.软断言是一个断言失败了，不会影响其他断言的执行
     */
    @Test
    public void testSum() {
        SoftAssert sa = new SoftAssert();
        System.out.println("\n测试方法->测试两个数相加");
        ClassToBeTested obj = new ClassToBeTested();
        int result = obj.addNum(1, 2);
        sa.assertEquals(result, 2);
//		Assert.assertEquals(result, 3);
        System.out.println("Assert 1 执行完成");
        sa.assertEquals(result, 3);
//		Assert.assertEquals(result, 3);
        System.out.println("Assert 2 执行完成");
        sa.assertAll();
    }
}
