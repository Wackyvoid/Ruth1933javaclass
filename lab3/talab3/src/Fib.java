import java.util.Scanner;

public class Fib {

    public static int fibonacciRecursive(int n) {
        if (n == 0) { //first two base cases are known information
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciRecursive(n-1) + fibonacciRecursive(n-2); //takes last two numbers in seq and adds them together
        }

    }

    public static int fibonacciIterative(int n) {
        int fib[] = new int[n+1];

        if (n == 0) {//first two base cases are known information
            return 0;
        } else if (n == 1) {//first two base cases are known information
            return 1;
        } else {
            fib[0] = 0;//the fib seq starts with 0 and 1
            fib[1] = 1;
            for (int i = 2; i <= n; i++){ //iterates till the fib is at the sum
                fib[i] = fib[i-1] + fib[i-2];
                //System.out.println(fib[i]);
            }
            return fib[n];
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonacciRecursive(0));
        System.out.println(fibonacciIterative(6));

        //VVpt2 of milestone 1
        System.out.println("Enter an integer n to get the n'th Fibonacci number:");
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        System.out.println("The " + n + "'th Fibonacci number using fibonacciRecursive is " + fibonacciRecursive(n));
        System.out.println("The " + n + "'th Fibonacci number using fibonacciRecursive is " + fibonacciIterative(n));
    }

}
