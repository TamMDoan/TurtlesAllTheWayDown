import org.junit.Assert;
import org.junit.Test;

public class GCDTests {

    @Test
    public void testGCDConstructor(){
        GCD gcd = new GCD();
        Assert.assertNotNull(gcd);
    }

    @Test
    public void testGCDRecursion(){
        GCD gcd = new GCD();
        int num1 = 102;
        int num2 = 68;
        int actualGCD = gcd.recursion(num1, num2);

        Assert.assertEquals(34, actualGCD);
    }

    @Test
    public void testGCDRecursion2(){
        GCD gcd = new GCD();
        int num1 = 1440;
        int num2 = 408;
        int actualGCD = gcd.recursion(num1, num2);

        Assert.assertEquals(24, actualGCD);
    }
}
