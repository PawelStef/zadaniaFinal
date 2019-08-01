package zadanie4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TimeCounter timeCounter = new TimeCounter();
        // print menu
        System.out.println("Progran coun time secend by secend");
        System.out.println("To start count, type -start-");
        System.out.println("To pause count, type -pause-");
        System.out.println("To stop count, type -stop-");
        System.out.println("To Quit progtam, type -quit-");

        boolean quit = false;

        String menuItem;

        do {
            menuItem = sc.nextLine().toLowerCase();

            switch (menuItem) {

                case "start":

                    System.out.println("Start counting");
                    new Thread(timeCounter).start();

                    break;

                case "stop":
                    timeCounter.timerStop();
                    System.out.println("Stop counting");
                    //timeCounter.setElapsTime(0);
                    break;

                case "pause":
                    timeCounter.timerPause();
                    System.out.println("Pause counting");
                    break;

                case "quit":

                    System.out.println("You've chosen qiut ");

                    quit = true;
                    break;

                default:

                    System.out.println("Invalid choice.");
            }

        } while (!quit);

        System.out.println("Bye-bye!");
    }
}
