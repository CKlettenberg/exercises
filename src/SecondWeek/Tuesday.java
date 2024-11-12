package SecondWeek;

import java.util.Scanner;

public class Tuesday {
    public static void main(String[] args) {
        //ternaryOperator();
        //maxOfTwoNumbers();
        checkPersonEligibleToVote();
    }

    public static void ternaryOperator() {

        int number = 7;

        String result = (number % 2 == 0) ? "Even" : "Odd";  //If "Ben"  else   "  " - Ternary operator

        System.out.println("The number is: " + number + " is " + result);
        System.out.println("Ternary operator");
    }

    public static void maxOfTwoNumbers() {

        int num1 = 10;
        int num2 = 20;
        int resultMax = (num1 > num2) ? num1 : num2;

        System.out.println("The maximum number of two numbers is: " + resultMax);

    }

    public static void checkPersonEligibleToVote() {

        int age = 17; //kui panna 20, siis vastus muutub

        String result = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println(result);

    }

}
