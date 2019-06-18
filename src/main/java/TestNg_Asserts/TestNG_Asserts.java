package TestNg_Asserts;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by DELL on 2019/6/17.
 */
public class TestNG_Asserts {

    @Test
    public void testNum() {
        System.out.println("测试两个数相加结果正确与否");
        ClassToBeTested obj = new ClassToBeTested();
        int result = obj.addNum(1, 2);
        Assert.assertEquals(result, 3);
    }

    @Test
    public void testStrings() {
        System.out.println("比对连接后的字符串");
        String expectedString = "Hello World";
        ClassToBeTested obj = new ClassToBeTested();
        String result = obj.addStrings("Hello", "World");
        Assert.assertEquals(result, expectedString);
    }

    @Test
    public void testArrays() {
        System.out.println("测试俩数组是否相等");
        int[] expectedArray = { 1, 2, 3,4 };
        ClassToBeTested obj = new ClassToBeTested();
        int[] result = obj.getArray();
        Assert.assertEquals(result, expectedArray);
        System.out.println("测试俩数组是否相等-->测试完成");
    }
}
