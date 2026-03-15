package utcluj.aut.lab2.exercises;

import java.util.ArrayList;

/**
 * Class for finding palindromic numbers in a given range.
 * Students should implement all methods to pass the unit tests.
 */
public class Ex2PalindromeFinder {

    /**
     * Checks if a number is palindromic (reads the same backward as forward).
     *
     * @param number the number to check
     * @return true if the number is palindromic, false otherwise
     */
    public boolean isPalindromic(int number) {
        // 1. Convert the number to a string
        String numberString=Integer.toString(number);
        // 2. Check if the string reads the same forward and backward
        StringBuilder palindrome=new StringBuilder(numberString);
        palindrome.reverse();
        if(numberString.equals(palindrome.toString())){
            return true;
        }
        // 3. Return the result
        return false;
    }

    /**
     * Finds all palindromic numbers in the given range [a, b], inclusive.
     *
     * @param a the lower bound of the range
     * @param b the upper bound of the range
     * @return an array of all palindromic numbers in the range
     * @throws IllegalArgumentException if a > b
     */
    public int[] findPalindromes(int a, int b) {
        // 1. Validate that a <= b, throw IllegalArgumentException if not
        if(a>b) throw new IllegalArgumentException("a must be smaller or equal to b");
        // 2. Create an array to store palindromic numbers
        ArrayList<Integer> array=new ArrayList<>();
        // 3. Iterate through each number in the range [a, b]
        for(int i=a; i<=b; i++){
            // 4. Check if each number is palindromic, add to array if true
            if(isPalindromic(i)) array.add(i);
        }
        // 5. Return the array
        int[] result = new int[array.size()];
        for(int i=0; i<array.size(); i++){
            result[i]=array.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Ex2PalindromeFinder p = new Ex2PalindromeFinder();
        int a=1;
        int b=100;
        int[] palindromes = p.findPalindromes(a, b);
        System.out.print("Palindromes between " + a + " and " + b + ": ");
        for (int i = 0; i < palindromes.length; i++) {
            System.out.print(palindromes[i]);
            if (i != palindromes.length - 1) System.out.print(", ");
        }
        System.out.println();
    }
}