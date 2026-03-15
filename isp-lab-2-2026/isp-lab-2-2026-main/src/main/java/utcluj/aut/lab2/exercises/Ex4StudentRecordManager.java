package utcluj.aut.lab2.exercises;

import java.util.Scanner;

public class Ex4StudentRecordManager {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cati studenti vrei sa introduci? ");
        int n = sc.nextInt();
        sc.nextLine();

        String[][] studenti = new String[n][3];

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " (nume, varsta, nota): ");
            String linie = sc.nextLine();
            String[] parts = parseStudentRecord(linie);
            if (parts != null) {
                studenti[i] = parts;
            } else {
                studenti[i][0] = "Anonim";
                studenti[i][1] = "0";
                studenti[i][2] = "0";
            }
        }

        String[] optiuni = getFilterAndSortOptions();

        String minGrade = optiuni[0];
        String sortBy = optiuni[1];
        boolean ascending = optiuni[2].equalsIgnoreCase("da");

        String[][] filtrati = filterByGrade(studenti, minGrade);
        String[][] sortati = sortRecords(filtrati, sortBy, ascending);

        displayRecords(sortati);

        sc.close();
    }

    public static String[] parseStudentRecord(String record) {
        String[] parts = record.split(",");
        if (parts.length != 3) return null;
        return parts;
    }

    public static String[][] filterByGrade(String[][] records, String minGrade) {
        int min = 0;
        try { min = Integer.parseInt(minGrade); } catch (Exception e) {}

        int count = 0;
        for (int i = 0; i < records.length; i++) {
            try {
                if (Integer.parseInt(records[i][2]) >= min) count++;
            } catch (Exception e) {}
        }

        String[][] result = new String[count][3];
        int j = 0;
        for (int i = 0; i < records.length; i++) {
            try {
                if (Integer.parseInt(records[i][2]) >= min) {
                    result[j] = records[i];
                    j++;
                }
            } catch (Exception e) {}
        }

        return result;
    }

    public static String[][] sortRecords(String[][] records, String sortBy, boolean ascending) {
        String[][] result = new String[records.length][3];
        for (int i = 0; i < records.length; i++) result[i] = records[i];

        int index = 0;
        if (sortBy.equalsIgnoreCase("varsta")) index = 1;
        else if (sortBy.equalsIgnoreCase("nota")) index = 2;

        for (int i = 0; i < result.length - 1; i++) {
            for (int k = 0; k < result.length - i - 1; k++) {
                boolean sw = false;
                if (index == 0) { // nume
                    if (ascending) {
                        if (result[k][0].compareTo(result[k + 1][0]) > 0) sw = true;
                    } else {
                        if (result[k][0].compareTo(result[k + 1][0]) < 0) sw = true;
                    }
                } else { // varsta sau nota
                    int a = 0, b = 0;
                    try { a = Integer.parseInt(result[k][index]); } catch (Exception e) {}
                    try { b = Integer.parseInt(result[k + 1][index]); } catch (Exception e) {}
                    if (ascending) {
                        if (a > b) sw = true;
                    } else {
                        if (a < b) sw = true;
                    }
                }
                if (sw) {
                    String[] tmp = result[k];
                    result[k] = result[k + 1];
                    result[k + 1] = tmp;
                }
            }
        }

        return result;
    }

    public static void displayRecords(String[][] records) {
        if (records.length == 0) {
            System.out.println("Nu exista inregistrari.");
            return;
        }

        System.out.println("Nume\tVarsta\tNota");
        for (int i = 0; i < records.length; i++) {
            System.out.println(records[i][0] + "\t" + records[i][1] + "\t" + records[i][2]);
        }
    }

    public static String[] getFilterAndSortOptions() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota minima pentru filtrare: ");
        String minGrade = sc.nextLine();
        System.out.print("Sortare dupa (nume/varsta/nota): ");
        String sortBy = sc.nextLine();
        System.out.print("Ascendent? (da/nu): ");
        String asc = sc.nextLine();
        return new String[]{minGrade, sortBy, asc};
    }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}