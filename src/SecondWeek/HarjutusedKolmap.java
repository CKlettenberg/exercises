package SecondWeek;

import java.util.Scanner;

public class HarjutusedKolmap {
    public static void main(String[] args) {
        //swits();
        //switsExercise();
        //calculator();
        //gradeDescription();
        //monthDays();
        //seasonFinder();


    }

    public static void swits() {
        int number = 6;
        switch (number) {
            case 5:
                System.out.println("first number is 1");
                break;
            case 2:
                System.out.println("first number is 2");
                break;
            case 3:
                System.out.println("first number is 3");
                break;
            case 4:
                System.out.println("first number is 4");
                break;
            case 1:
                System.out.println("first number is 5");
                break;
            default:
                System.out.println("Invalid number");
                break;
        }
    }

    public static void switsExercise() {
        //print the day of the week
        int number;
        System.out.println("Enter a number from 1 to 7");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("1. day of the week is Monday");
                break;
            case 2:
                System.out.println("2. day of the week is Tuesday");
                break;
            case 3:
                System.out.println("3. day of the week is Wednesday");
                break;
            case 4:
                System.out.println("4. day of the week is Thursday");
                break;
            case 5:
                System.out.println("5. day of the week is Friday");
                break;
            case 6:
                System.out.println("6. day of the week is Saturday");
                break;
            case 7:
                System.out.println("7. day of the week is Sunday");
                break;
            default:

                System.out.println("Invalid number");
                break;

        }
    }

    public static void calculator() {
        System.out.println("Hello, I am a Calculator");
        System.out.println("");
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number :");
        double number1 = sc.nextInt();

        System.out.println("enter second number :");
        double number2 = sc.nextInt();

        System.out.println("enter operator +,-,/ or x :");
        char operator = sc.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;


        }
    }

    public static void gradeDescription() {
        System.out.println("enter a grade character from A to F");
        Scanner sc = new Scanner(System.in);
        char character = sc.next().charAt(0);
        switch (character) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Poor");
                break;
            case 'F':
                System.out.println("Fail");
                break;
        }
    }

    public static void monthDays() {
        //how many days in a month
        System.out.println("Enter a number from 1 to 12 and i will tell how many days it has");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        switch (month) {
            case 1:
                System.out.println("January has " + 31 + " days");
                break;
            case 2:
                System.out.println("February has " + 28 + " days");
                break;
            case 3:
                System.out.println("March has " + 31 + " days");
                break;
            case 4:
                System.out.println("April has " + 31 + " days");
                break;
            case 5:
                System.out.println("May has " + 31 + " days");
                break;
            case 6:
                System.out.println("June has " + 31 + " days");
                break;
            case 7:
                System.out.println("July has " + 31 + " days");
                break;
            case 8:
                System.out.println("August has " + 31 + " days");
                break;
            case 9:
                System.out.println("September has " + 31 + " days");
                break;
            case 10:
                System.out.println("October has " + 31 + " days");
                break;
            case 11:
                System.out.println("November has " + 31 + " days");
                break;
            case 12:
                System.out.println("December has " + 31 + " days");
                break;
            default:
                System.out.println("Invalid number");
                break;


        }


    }

    public static void seasonFinder() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a month number (1-12) and i will tell you the season: ");
        int month = scanner.nextInt();

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Invalid month number! Enter a number between 1 and 12.");

        }
    }

}
