package DayFour;

public class brakecontinue {
    public static void main(String[] args) {
       /* continue1();
        brake();
        brake2();*/
        brake3();


        int rollDice = rollDice();
        System.out.println("Your rolled a number:" + rollDice);
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


    public static void brake2() {

        int[] numbers = {1, 3, 7, 4, 9, 10};
        System.out.println("Even Numbers:");
        for (int a = 0; a < numbers.length; a++) {
            if (numbers[a] % 2 == 0) {
                System.out.println(numbers[a]);


            }
        }
    }

     public static void brake3() {
        for (int count = 1; count <= 20; count++) {
            if (count % 1 == 0) {
                System.out.println(count);
            }


     }



    }
}

