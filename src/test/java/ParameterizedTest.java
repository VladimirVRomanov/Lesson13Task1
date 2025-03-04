import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterizedTest {

    @DataProvider(name = "Дата провайдер")
    public Object[][] dataProviderMethod() {
        return new Object[][] {
                { 1, 2, 3 },
                { 4, 5, 9 },
                { -1, 1, 0 },
                { 5, 5, 10}
        };
    }

    @Test(dataProvider = "Дата провайдер")
    public void testAdd(int a, int b, int expectedSum) {
        Assert.assertEquals(add(a, b), expectedSum, a + " + " + b + " должно быть равно " + expectedSum);
    }

    private int add(int a, int b) {
        return a + b;
    }
}