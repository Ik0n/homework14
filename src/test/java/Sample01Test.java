import org.junit.*;
import org.junit.runners.parameterized.TestWithParameters;

public class Sample01Test {

    int[] array01;
    int[] array02;
    int[] array03;
    int[] array04;

    @Test
    public void method01() {
        int[] array01 = {4,1,1,1,1,1,1,1,1,1};
        int[] expected = {4,1,1,1,1,1,1,1,1,1};
        int[] actually = Sample01.method01(array01);
        Assert.assertArrayEquals(expected, actually);

    }

    @Test
    public void method02() {
        int[] array02 = {1,4,1,1,1,1,1,1,1,1};
        int[] expected = {4,1,1,1,1,1,1,1,1};
        int[] actually = Sample01.method01(array02);
        Assert.assertArrayEquals(expected, actually);

    }

    @Test
    public void method03() {
        int[] array03 = {1,1,4,1,1,1,1,1,1,1};
        int[] expected = {4,1,1,1,1,1,1,1};
        int[] actually = Sample01.method01(array03);
        Assert.assertArrayEquals(expected, actually);

    }

    @Test
    public void method04() {
        int[] array04 = {1,1,1,4,1,1,1,1,1,1};
        int[] expected = {4,1,1,1,1,1,1};
        int[] actually = Sample01.method01(array04);
        Assert.assertArrayEquals(expected, actually);

    }

}
