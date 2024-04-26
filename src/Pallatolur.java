import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Pallatolur {
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        List<Integer> evenPrimes = new ArrayList<>();

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0 && isPrime(i)) {
                evenPrimes.add(i);
            }
        }

        if (evenPrimes.isEmpty()) {
            System.out.println(":(");
        } else {
            System.out.println(evenPrimes.size());
            for (int prime : evenPrimes) {
                System.out.print(prime + " ");
            }
            System.out.println();
        }
    }
}

// https://open.kattis.com/problems/pallatolur