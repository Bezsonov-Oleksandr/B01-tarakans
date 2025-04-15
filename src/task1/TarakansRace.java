package task1;

import java.util.Scanner;

public class TarakansRace {
    private static int numberTarakans;

    public static void main(String[] args)  throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        System.out.print("Number of tarakans : ");
        numberTarakans = scan.nextInt();
        System.out.print("Distance of the Race : ");
        Store.setDistance(scan.nextInt());

        Thread[] tarakans = new Thread[numberTarakans];
        for (int i = 0; i < numberTarakans; i++) {
            tarakans[i] = new Thread(new Tarakan(i+1));
            tarakans[i].start();
        }
        for (int i = 0; i < numberTarakans; i++) {
            tarakans[i].join();
        }

        System.out.printf("Congratulations to tarakan #%d (winner)\n", Store.getWinner());
    }
}
