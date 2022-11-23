import java.util.Scanner;

/* Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
n! (произведение чисел от 1 до n) */


public class triangleAndFactorial {

    static int getFactorialR(int n){
        if (n <= 1) {
            return 1;
        } else {
            return getFactorialR(n -1) * n;
        }
    }


    static int getFactorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.print("Введите целое число: ");
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        int res1 = getFactorial(n);
        int res2 = getFactorialR(n);
    
        System.out.println("n! = " + res1 + ", n! рекурсивно = " + res2);
    }
    
}
