import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int die1, die2, die3;
        int rollCount = 0;

        System.out.printf("%-10s %-10s %-10s %-10s%n", "Roll #", "Die 1", "Die 2", "Die 3");
        System.out.println("----------------------------------------");

        do {
            die1 = rand.nextInt(6) + 1;
            die2 = rand.nextInt(6) + 1;
            die3 = rand.nextInt(6) + 1;
            rollCount++;

            System.out.printf("%-10d %-10d %-10d %-10d%n", rollCount, die1, die2, die3);
        } while (!(die1 == die2 && die2 == die3)); // continue until all three dice match

        System.out.println("Triple rolled! All dice show: " + die1);
    }
}
