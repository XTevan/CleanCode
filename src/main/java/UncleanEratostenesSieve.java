import java.util.ArrayList;
import java.util.List;

public class UncleanEratostenesSieve {

    public static void main(String[] args) {
        UncleanEratostenesSieve main = new UncleanEratostenesSieve();
        int limit = 1000;
        System.out.println("Confuse code:");
        main.runEratosthenesSieve(limit);
    }

    public void runEratosthenesSieve(int upperBnd) {

        int upperBdSqRt = (int) Math.sqrt(upperBnd);//Check numbers up to upperBound Square Root
        boolean[] isCpst = new boolean[upperBnd + 1];//True if i'th number is composite false if prime

        for (int m = 2; m <= upperBdSqRt; m++) {
            if (!isCpst[m]) {
                System.out.print(m + " ");
                for (int k = m * m; k <= upperBnd; k += m)//mark multiples as composite number
                    isCpst[k] = true;
            }
        }
        for (int m = upperBdSqRt; m <= upperBnd; m++)//print numbers that were left untouched
            if (!isCpst[m])
                System.out.print(m + " ");

    }














    public List<Integer> runEratosthenesSieveReturn(int upperBnd) {

        List<Integer> primes = new ArrayList<>();
        int upperBdSqRt = (int) Math.sqrt(upperBnd);//Check numbers up to upperBound Square Root
        boolean[] isCpst = new boolean[upperBnd + 1];//True if i'th number is composite false if prime

        for (int m = 2; m <= upperBdSqRt; m++) {
            if (!isCpst[m]) {
                System.out.print(m + " ");
                primes.add(m);
                for (int k = m * m; k <= upperBnd; k += m)//mark multiples as composite number
                    isCpst[k] = true;
            }
        }
        for (int m = upperBdSqRt; m <= upperBnd; m++)
            if (!isCpst[m]) {
                System.out.print(m + " ");
                primes.add(m);
            }
        return primes;
    }
}
