import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTest {

    @Test
    public void testAdd() {
        int a = 5;
        int b = 3;
        int expectedSum = 8;
        Assert.assertEquals(add(a, b), expectedSum, a + " + " + b + " должно быть равно " + expectedSum);
    }

    private int add(int a, int b) {
        return a + b;
    }
}