package DayTwo;

import java.util.Scanner;

public class DayTwo1 {
    public static void main(String[] args) {
        String name = "Taavi";
        String song = "Song";

        System.out.println(name);
        int lengthOfTaavi = name.length();
        System.out.println(lengthOfTaavi);

        System.out.println(song);
        int lengthOfSong = song.length();
        System.out.println(lengthOfSong);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n = scanner.nextInt();
        System.out.println(n++);
        System.out.println("Second: " + n);





    }

}
