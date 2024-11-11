package DayFour;

import java.util.Arrays;

public class Katsetus {
    public static void main(String[] args) {
        int[] firstArray = new int[5];
        //{0,0,0,0,0}
        System.out.println("Esimene lahendus ilma lisamata: " + Arrays.toString(firstArray));
        firstArray[0]++;
        firstArray[2]++;
        firstArray[4]++;
        //{1,0,0,0,0}
        System.out.println("Teine lahendus peale lisamist: " + Arrays.toString(firstArray));

    }
}
