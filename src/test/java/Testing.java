import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Random;


public class Testing {
    @Test
    public void Main_tests() {
        int[] numbers = {1,2,3,4,5};
        int result_min = Main._min(numbers);
        int result_max = Main._max(numbers);
        int result_mult = Main._mult(numbers);
        int result_sum = Main._sum(numbers);
        assertEquals(1, result_min);
        assertEquals(5, result_max);
        assertEquals(1*2*3*4*5, result_mult);
        assertEquals(1+2+3+4+5, result_sum);
    }

    @Test
    public void speed_test() {
        int[] numbers = new int[1000001];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000) + 1;
        }
        long startTime = System.currentTimeMillis();
        int t1 = Main._min(numbers);
        int t2 = Main._max(numbers);
        int t3 = Main._mult(numbers);
        int t4 = Main._sum(numbers);
        long endTime = System.currentTimeMillis();
        long time  = (endTime - startTime);
        boolean flag = true ? time <= 20 : false;
        assertEquals(true, flag);
    }
    @Test
    public void OtrNumbers_test() {
        int[] numbers = {-1,-2,-3,-4,-5};
        int result_min = Main._min(numbers);
        int result_max = Main._max(numbers);
        int result_mult = Main._mult(numbers);
        int result_sum = Main._sum(numbers);
        assertEquals(-5, result_min);
        assertEquals(-1, result_max);
        assertEquals(-1*-2*-3*-4*-5, result_mult);
        assertEquals(-1-2-3-4-5, result_sum);
    }
}