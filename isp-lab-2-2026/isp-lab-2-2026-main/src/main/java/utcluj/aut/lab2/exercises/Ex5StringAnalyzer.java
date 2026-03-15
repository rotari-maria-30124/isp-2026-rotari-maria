package utcluj.aut.lab2.exercises;

import java.util.Scanner;
import java.util.ArrayList;

public class Ex5StringAnalyzer {

    public String[] parseInput(String input) {
        return input.split(";");
    }

    public String[] findLongest(String[] strings) {
        int maxLen = 0;
        for (String s : strings) {
            if (s.length() > maxLen) maxLen = s.length();
        }
        ArrayList<String> list = new ArrayList<>();
        for (String s : strings) {
            if (s.length() == maxLen) list.add(s);
        }
        return list.toArray(new String[0]);
    }

    public String[] findShortest(String[] strings) {
        if (strings.length == 0) return new String[0];
        int minLen = strings[0].length();
        for (String s : strings) {
            if (s.length() < minLen) minLen = s.length();
        }
        ArrayList<String> list = new ArrayList<>();
        for (String s : strings) {
            if (s.length() == minLen) list.add(s);
        }
        return list.toArray(new String[0]);
    }

    public int[] countVowels(String[] strings) {
        int[] counts = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            int c = 0;
            for (char ch : strings[i].toCharArray()) {
                if ("aeiouAEIOU".indexOf(ch) != -1) c++;
            }
            counts[i] = c;
        }
        return counts;
    }

    public int[] countConsonants(String[] strings) {
        int[] counts = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            int c = 0;
            for (char ch : strings[i].toCharArray()) {
                if (Character.isLetter(ch) && "aeiouAEIOU".indexOf(ch) == -1) c++;
            }
            counts[i] = c;
        }
        return counts;
    }

    public String[] findMostVowels(String[] strings) {
        int[] vowels = countVowels(strings);
        int max = 0;
        for (int v : vowels) if (v > max) max = v;
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            if (vowels[i] == max) list.add(strings[i]);
        }
        return list.toArray(new String[0]);
    }

    public String[] findMostConsonants(String[] strings) {
        int[] cons = countConsonants(strings);
        int max = 0;
        for (int c : cons) if (c > max) max = c;
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            if (cons[i] == max) list.add(strings[i]);
        }
        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex5StringAnalyzer sa = new Ex5StringAnalyzer();

        System.out.print("Enter strings separated by semicolons: ");
        String input = sc.nextLine();

        String[] arr = sa.parseInput(input);

        String[] longest = sa.findLongest(arr);
        String[] shortest = sa.findShortest(arr);
        int[] vowels = sa.countVowels(arr);
        int[] consonants = sa.countConsonants(arr);
        String[] mostVowels = sa.findMostVowels(arr);
        String[] mostConsonants = sa.findMostConsonants(arr);

        System.out.print("Longest string(s): ");
        for (String s : longest) System.out.print(s + " ");
        System.out.println();

        System.out.print("Shortest string(s): ");
        for (String s : shortest) System.out.print(s + " ");
        System.out.println();

        System.out.println("Vowels count:");
        for (int i = 0; i < arr.length; i++) System.out.println(arr[i] + ": " + vowels[i]);

        System.out.println("Consonants count:");
        for (int i = 0; i < arr.length; i++) System.out.println(arr[i] + ": " + consonants[i]);

        System.out.print("String(s) with most vowels: ");
        for (String s : mostVowels) System.out.print(s + " ");
        System.out.println();

        System.out.print("String(s) with most consonants: ");
        for (String s : mostConsonants) System.out.print(s + " ");
        System.out.println();

        sc.close();
    }
}