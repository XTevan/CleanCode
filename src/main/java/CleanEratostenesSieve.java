import java.util.ArrayList;
import java.util.List;

public class CleanEratostenesSieve {

    public static void main(String[] args) {
        CleanEratostenesSieve main = new CleanEratostenesSieve();
        int limit = 1000;
        System.out.println("Clean code:");
        main.verifyAndPrintPrimes(limit);
    }

    public void verifyAndPrintPrimes(int upperBound) {

        List<Integer> primeNumbers = calculatePrimes(upperBound);
        printNumbers(primeNumbers);
    }

    public List<Integer> calculatePrimes(int upperBound) {

        int upperBoundSquareRoot = (int) Math.sqrt(upperBound);
        boolean[] isComposite = new boolean[upperBound + 1];
        List<Integer> primes = new ArrayList<>();

        for (int currentNumber = 2; currentNumber <= upperBoundSquareRoot; currentNumber++) {
            if (!isComposite[currentNumber]) {
                primes.add(currentNumber);
                for (int multiples = currentNumber * currentNumber; multiples <= upperBound; multiples += currentNumber) {
                    isComposite[multiples] = true;
                }
            }
        }

        for (int numbers = upperBoundSquareRoot + 1; numbers <= upperBound; numbers++)
            if (!isComposite[numbers])
                primes.add(numbers);

        return primes;
    }

    public void printNumbers(List<Integer> numbers) {
        System.out.println(numbers);
    }
}
