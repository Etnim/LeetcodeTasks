package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayModifierTest {
    private ArrayModifier ar = new ArrayModifier();

    @Test
    public void rotateTest_k3() {
        int[] num = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        ar.rotate(num, k);
        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, num);
    }

    @Test
    public void rotateTest_k2() {
        int[] num = new int[]{-1, -100, 3, 99};
        int k = 2;
        ar.rotate(num, k);
        assertArrayEquals(new int[]{3, 99, -1, -100}, num);
    }

    @Test
    public void rotateTest_k1() {
        int[] num = new int[]{1};
        int k = 1;
        ar.rotate(num, k);
        assertArrayEquals(new int[]{1}, num);
    }

    @Test
    public void rotateTest_k0() {
        int[] num = new int[]{1};
        int k = 0;
        ar.rotate(num, k);
        assertArrayEquals(new int[]{1}, num);
    }
}
