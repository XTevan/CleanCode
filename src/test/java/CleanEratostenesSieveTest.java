import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class CleanEratostenesSieveTest {

    private static final int FIFTY = 50;
    private static final int TEN = 10;

    private final CleanEratostenesSieve cleanEratostenesSieve = new CleanEratostenesSieve();

    @Test
    public void testCalculatePrimesUnder50() {

        List<Integer> result = cleanEratostenesSieve.calculatePrimes(FIFTY);
        assertEquals(15,result.size());
    }

    @Test
    public void testPrimesUnder10() {
        Integer[] result = cleanEratostenesSieve.calculatePrimes(TEN).toArray(new Integer[]{});
        assertArrayEquals(new Integer[]{2,3,5,7}, result);
    }
}