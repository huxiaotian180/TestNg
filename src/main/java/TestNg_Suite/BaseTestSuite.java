package TestNg_Suite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

/**
 * Created by DELL on 2019/6/17.
 */
public class BaseTestSuite {

    @BeforeClass
    public void beforeClass() {
        System.out.println("\n TestNg_Suite.BaseTestSuite -> beforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("\n TestNg_Suite.BaseTestSuite -> afterClass");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("\n TestNg_Suite.BaseTestSuite -> beforeSuite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("\n TestNg_Suite.BaseTestSuite -> afterSuite");
    }

}
