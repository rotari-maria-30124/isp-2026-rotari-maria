package utcluj.aut.lab2.exercises;

import java.util.Arrays;
import java.util.Random;


/**
 * Class for generating and analyzing arrays of random integers.
 * Students should implement all methods to pass the unit tests.
 */
public class Ex1ArrayAnalyzer {

    public int[] generateArray() {
        Random r=new Random();
        int a=r.nextInt(25,150);
        int[] b=new int[a];
        for(int i=0; i<a; i++) {
            b[i] = r.nextInt(-100, 100);
        }
        return b;
    }

    /**
     * Calculates the average value of all elements in the given array.
     *
     * @param array the array to analyze
     * @return the average value of all elements
     */
    public double calculateAverage(int[] array) {
        int sum=0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }
        double average=(double)sum/array.length;
        if(array.length==0){
            return 0.0;
        }
        return average;
    }

    /**
     * Counts how many elements are above and below the given average.
     *
     * @param array the array to analyze
     * @param average the average value to compare against
     * @return an array of 2 integers: [countAbove, countBelow]
     */
    public int[] countAboveBelowAverage(int[] array, double average) {
        int above=0;
        int below=0;
        for(int i=0; i<array.length;i++){
            if(array[i]>average){
                above++;
            }
            if(array[i]<average){
                below++;
            }
        }
        return new int[]{above,below};
    }

    public static void main(String[] args) {
        Ex1ArrayAnalyzer ex=new Ex1ArrayAnalyzer();
        int[] array=ex.generateArray();
        double average=ex.calculateAverage(array);
        int[] aboveBelowAverage=ex.countAboveBelowAverage(array,average);
        System.out.println("Array is: " + Arrays.toString(array));
        System.out.println("Average is: " + average);
        System.out.println("Numbers above and below average: " +Arrays.toString(aboveBelowAverage));
    }
}
