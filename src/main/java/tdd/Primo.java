package tdd;

public class Primo {

    public static boolean esPrimo(int n) {
        if (n < 2) {
            return false;
        }
        for (int divisor = 2; divisor * divisor <= n; divisor++) {
            if (n % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}