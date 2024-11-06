package DayTwo;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class ülesanded {
    public static void main(String[] args) {
/*
        System.out.println("Hello World");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Esimene number");
        double a = scanner.nextDouble();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Teine number");
        double b = scanner.nextDouble();
        System.out.println("Liitmine = " + (a + b));
        System.out.println("Lahutamine = " + (a - b));
        System.out.println("Korrutamine = " + (a * b));
        System.out.println("Jagamine = " + (a / b));

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Sisesta üks number ja mina ütlen kas see on paaris või paaritu");
        int number = scanner3.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " On paaris");
        } else {
            System.out.println(number + " On paaritu");
        }

        System.out.println("Sisesta kolm numbrit ja mina ütlen milline neist on suurim");

        Scanner scanner4 = new Scanner(System.in);
        int number2 = scanner4.nextInt();

        Scanner scanner5 = new Scanner(System.in);
        int number3 = scanner5.nextInt();

        Scanner scanner6 = new Scanner(System.in);
        int number4 = scanner6.nextInt();

        if (number2 > number3 && number2 > number4) {
            System.out.println("Suurim on " + number2);
        }
        else if (number3 > number2 && number3 > number4) {
            System.out.println("Suurim on " + number3);
        }
        else if (number4 > number2 && number4 > number3) {
            System.out.println("Suurim on " + number4);
        }




*/
    String hello = ("hello world");
    System.out.println(hello.toUpperCase());

    String hello1 = ("HELLO WORLD");
    System.out.println(hello1.toLowerCase());

    String hello2 = "Hello World";
    String substring = "World";
    boolean contains = hello2.contains(substring);
        System.out.println(contains);

    String hello4 = "Hello";
    char firstChar = hello4.charAt(0);
    System.out.println(firstChar);


    String hello5 = "Hello World";
    String modified = hello5.replace('o','a');
        System.out.println(modified);

    System.out.println("kas hello world algab - Hello ja lõppeb - World");
    String hello6 = "Hello World";
    System.out.println(hello6.startsWith("Hello") && hello6.endsWith("World"));

    String hello7 = "Hello, World!";
    System.out.println(hello7.substring(7, 12));

    String hello8 = "abracadabra";
    char searchChar = 'r';
    int firstPosition = hello8.indexOf(searchChar);
    int lastPosition = hello8.lastIndexOf(searchChar);
    System.out.println("esimene positsioon: " + firstPosition);















    }
}
