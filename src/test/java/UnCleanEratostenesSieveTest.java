import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class UnCleanEratostenesSieveTest {

    private static final int FIFTY = 50;
    private static final int TWENTY = 20;

    private final UncleanEratostenesSieve unCleanEratostenesSieve = new UncleanEratostenesSieve();


    @Test
    public void testRunEratosthenesSieveReturn() {
        List<Integer> result = unCleanEratostenesSieve.runEratosthenesSieveReturn(FIFTY);
        assertEquals(15, result.size());
    }

    @Test
    public void testPrimesUnder20() {
        Integer[] result = unCleanEratostenesSieve.runEratosthenesSieveReturn(TWENTY).toArray(new Integer[]{});
        assertArrayEquals(new Integer[]{2, 3, 5, 7, 11, 13, 17, 19}, result);
    }
}