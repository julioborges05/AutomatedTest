package GenericTest;

import GenericConfig.GenericConfig;
import org.junit.BeforeClass;
import org.junit.Test;

public class GenericTest {

    private static GenericConfig genericConfig;

    @BeforeClass
    public static void beforeTest() {
        genericConfig = new GenericConfig();
    }

    @Test
    public void test() {
         genericConfig.getWebDriver().get("https://www.google.com/");
         genericConfig.getWebDriver().close();
    }
}
