package DayFour;

public class brakecontinue {
    public static void main(String[] args) {
        /*continue1();
        brake();*/
        evenNR();
        countNR();
        multiples3();

        int rollDice = rollDice();
        /*System.out.println("Your rolled a number:" + rollDice);*/
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
        for (int count = 1; count <= 20; count++) {
            // Kontrolli paarituid numbreid
            if (count % 2 != 0) {
                // Kui number on 5ga jagatav, siis seda ei kuva
                if (count % 5 == 0) {
                    continue;
                }
                System.out.println("Paaritud numbrid(va 5/ numbrid): " + count);
            }
        }

    }

    private static void evenNR() {
        int[] numbers = {1, 3, 7, 4, 9, 10};
        for (int a = 0; a < numbers.length; a++) {
            if (numbers[a] % 2 == 0) {
                System.out.println("First even number: " + numbers[a]);
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
}
