import org.junit.Assert;
import org.junit.Test;

public class FactorialTests {

    @Test
    public void testFactorialConstructor(){
        Factorial factorial = new Factorial();
        Assert.assertNotNull(factorial);
    }

    @Test
    public void testFactorialRecursion(){
        Factorial factorial = new Factorial();
        int actual = factorial.recursion(5);

        Assert.assertEquals(120, actual);
    }

    @Test
    public void testFactorialRecursion2(){
        Factorial factorial = new Factorial();
        int actual = factorial.recursion(10);

        Assert.assertEquals(3628800, actual);
    }
}
