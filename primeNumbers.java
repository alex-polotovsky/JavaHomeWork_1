import java.util.Scanner;

public class primeNumbers {

    static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void primeNumbers(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                System.out.printf("%d ", i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = console.nextInt();
        primeNumbers(num);
    }
}