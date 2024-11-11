package DayFour;

import java.sql.SQLOutput;

public class Brakecontinue {
    public static void main(String[] args) {
        //continue1();
        //brake();
        //evenNR();
        //countNR();
        //multiples3();
        //negativeNumbers();
        higherThan50();

        int rollDice = rollDice();
        //System.out.println("Your rolled a number:" + rollDice);
    }

    public static void continue1() {
        for (int count = 1; count <= 5; count++) {
            if (count == 3) {
                continue;
            }
            System.out.println(count);
        }
    }

    private static void brake() {
        for (int count11 = 1; count11 <= 5; count11++) {
            if (count11 == 3) {
                break;
            }
            System.out.println("count is :" + count11);
        }
    }

    private static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    private static void countNR() {
        for (int count = 1; count <= 20; count += 2) {
            if (count % 5 == 0) {
                continue;
            }
            System.out.println("Paaritud numbrid(va 5/ numbrid): " + count);
        }

    }

    private static void evenNR() {
        int[] numbers = {1, 3, 7, 4, 9, 10};
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println("First even number: " + num);
                break;
            }
        }
    }

    private static void multiples3() {
        for (int i = 3; i <= 30; i += 3) {
            if (i % 6 == 0) {
                continue;
            }
            System.out.println("kolme liitmise tulemused(va 6/ numbrid): " + i);
        }
    }

    private static void negativeNumbers() {
        int[] numbers = {5, 12, 3, 7, -4, 8, 2};
        int sum = 0;
        for (int num : numbers) {
            if (num < 0) {
                ;
                break;
            }
            sum += num;
        }
        System.out.println(sum);
    }

    private static void higherThan50() {
        int[] numbers = {23, 45, 39, 51, 48, 69};
        for (int num : numbers) {
            if (num > 50) {
                System.out.println(num);
                break;
            }
        }
    }
}