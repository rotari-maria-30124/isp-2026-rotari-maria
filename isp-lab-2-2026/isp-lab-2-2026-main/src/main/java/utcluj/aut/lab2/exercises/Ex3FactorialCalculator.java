package utcluj.aut.lab2.exercises;
import java.util.Scanner;
/**
 * Class for calculating factorials using recursive and non-recursive approaches.
 * Students should implement all methods to pass the unit tests.
 */
public class Ex3FactorialCalculator {

    /**
     * Calculates the factorial of n using recursion.
     *
     * @param n the number to calculate factorial for
     * @return the factorial of n
     * @throws IllegalArgumentException if n is negative
     */
    public long recursiveFactorial(int n) {
        // 1. Validate that n is not negative, throw IllegalArgumentException if it is
        if(n<0) throw new IllegalArgumentException("n cannot be negative");
        // 2. Implement the recursive algorithm for factorial
        if(n==0) return 1;
        if(n==1) return n;
        return recursiveFactorial(n-1)*n;
        // 3. Remember the base case (0! = 1)
    }

    /**
     * Calculates the factorial of n using a non-recursive approach.
     *
     * @param n the number to calculate factorial for
     * @return the factorial of n
     * @throws IllegalArgumentException if n is negative
     */
    public long nonRecursiveFactorial(int n) {
        // 1. Validate that n is not negative, throw IllegalArgumentException if it is
        if(n<0) throw new IllegalArgumentException("n cannot be negative");
        // 2. Implement a loop-based algorithm for factorial
        if(n==0) return 1;
        if(n==1) return 1;
        long f=1;
        for(int i=1; i<=n; i++){
            f=f * i;
        }
        // 3. Remember the base case (0! = 1)
        return f;
    }

    /**
     * Compares the execution time of both factorial methods.
     *
     * @param n the number to calculate factorial for
     * @return an array with [recursiveTime, nonRecursiveTime] in nanoseconds
     */
    public long[] compareExecutionTime(int n) {
        // 1. Measure the execution time of recursiveFactorial
        long startTime=System.currentTimeMillis();
        long rec=recursiveFactorial(n);
        long resultRecursive=System.currentTimeMillis() - startTime;
        // 2. Measure the execution time of nonRecursiveFactorial
        long nonRec=nonRecursiveFactorial(n);
        long resultNonRecursive=System.currentTimeMillis() - startTime;
        // 3. Return both times in an array
        return new long[]{resultRecursive,resultNonRecursive};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex3FactorialCalculator fc = new Ex3FactorialCalculator();
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        long factRec = fc.recursiveFactorial(n);
        long factNonRec = fc.nonRecursiveFactorial(n);
        long[] times = fc.compareExecutionTime(n);
        System.out.println("Recursive factorial: " + factRec);
        System.out.println("Non-recursive factorial: " + factNonRec);
        System.out.println("Recursive time (ns): " + times[0]);
        System.out.println("Non-recursive time (ns): " + times[1]);
        sc.close();
    }
}