package Exrcise1;

import java.util.Scanner;

public class Main {

    public static void displayMenu(ATC atc) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Add aircraft");
        System.out.println("2. Take off");
        System.out.println("3. Land");
        System.out.println("4. Exit");
        System.out.print("Command: ");
        String command = scanner.nextLine();

        switch (command) {
            case "1":
                System.out.print("Aircraft id: ");
                String id = scanner.nextLine();
                atc.addAircrafts(id);
                break;

            case "2":
                System.out.print("Aircraft id: ");
                id = scanner.nextLine();
                System.out.print("Altitude: ");
                int altitude = scanner.nextInt();
                atc.addCommand(id, new TakeOffCommand(Command.TAKEOFF_CMD, altitude));
                break;

            case "3":
                System.out.print("Aircraft id: ");
                id = scanner.nextLine();
                atc.addCommand(id, new LandCommand(Command.LAND_CMD));
                break;

            case "4":
                atc.showAircrafts();
                break;
            case "5":
                System.exit(0);
                break;
        }
    }

    public static void main(String[] args) {
        ATC atc = new ATC();
        while (true) {
            displayMenu(atc);
        }
    }
}