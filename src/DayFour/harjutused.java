package DayFour;

import java.util.Arrays;

public class harjutused {
    public static void main(String[] args) {

        getValues1To10();
        fordHondaAudi();
        oneToHundredSum();
        evenNumbers();
        multiplicationTable();

    }

    public static void getValues1To10() {
        for (int countNumbers = 1; countNumbers <= 10; countNumbers++) {
            System.out.println("numbrid: " + countNumbers);


        }
    }

    public static void fordHondaAudi() {
        String[] cars = {"Ford", "Honda", "Audi"};
        for (String car : cars) {
            System.out.println("car: " + car);
        }
    }

    public static void oneToHundredSum() {
        int sum = 0;
        int countNrTo = 1;
        while (countNrTo <= 100) {
            sum += countNrTo;
            countNrTo++;
        }

        System.out.println("1st 100ni numbrid kokku teevad summa: " + sum);
    }

    public static void evenNumbers() {
        for (int toTwenty = 2; toTwenty <= 20; toTwenty += 2) {
            System.out.println(toTwenty + " ");

        }
    }

    public static void multiplicationTable() {
        int seven = 7;
        for (int multiplication = 1; multiplication <= 10; multiplication++) {

            System.out.println(seven + " X " + multiplication + " = " + seven * multiplication);

        }
    }


}

