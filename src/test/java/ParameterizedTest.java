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
    public void parameterizedTest(int a, int b, int expectedSum) {
        Assert.assertEquals(a + b, expectedSum, "Сумма должна быть равна " + expectedSum);
    }
}