import org.junit.Assert;
import org.junit.Test;

public class Sample02Test {

    @Test
    public void method01() {

        boolean expected = true;
        int[] array01 = {1,1,1,4,4,1,4,4};
        boolean actual = Sample02.method01(array01);

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void method02() {

        boolean expected = false;
        int[] array02 = {1,1,1,1,1,1};
        boolean actual = Sample02.method01(array02);
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void method03() {

        boolean expected = false;
        int[] array03 = {4,4,4,4};
        boolean actual = Sample02.method01(array03);

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void method04() {

        boolean expected = true;
        int[] array04 = {1,4,4,1,1,4,3};
        boolean actual = Sample02.method01(array04);
        Assert.assertEquals(expected, actual);

    }

}
