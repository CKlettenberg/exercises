package DayThree;

public class Harjutusreturn {
    public static void main(String[] args) {

        boolean checkIfNumberIsEven = isEven(6);
        System.out.println(checkIfNumberIsEven);


    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
