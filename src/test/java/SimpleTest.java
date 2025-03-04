import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTest {

    @Test
    public void simpleTest() {
        Assert.assertEquals(2 + 2, 4, "2 + 2 должно быть равно 4");
    }
}