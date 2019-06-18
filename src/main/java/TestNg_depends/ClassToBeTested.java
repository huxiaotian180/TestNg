package TestNg_depends;

/**
 * Created by DELL on 2019/6/17.
 */
public class ClassToBeTested {

    public int addNum(int a, int b){
        return a+b;
    }
    public String addStrings(String a, String b) {
        return a + " " + b;
    }

    public int[] getArray() {
        int[] arrayExample = {1, 2, 3};
        return arrayExample;
    }
}
