package utcluj.aut;
import java.util.Scanner;
public class SecondClass {
    public static void main(String[] args) {
        System.out.println("Da un nr pls: "); //sout tab
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("Suma primelor "+n+"numere pare este: "+ firstNEvenSum(n)5);
    } //psvm tab

    public static int firstNEvenSum(int n) {
        int sum = 0;
        int j = 0;
        for (int i = 0; i < n; i++) { //fori tab
            sum += j;
            j += 2;
        }
        return sum;
    }
}
