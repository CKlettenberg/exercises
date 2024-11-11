package DayThree;

public class Harjutus {
    public static void main(String[] args) {
        int a = 4;
        int b = 4;
        getArea(a, b);

    }

    private static void getArea(int a, int b) {
        int result = a * b;
        checkArea(result);

    }

    private static void checkArea(int result) {
        if (result < 20) {
            System.out.println("Area is smaller than 20");
        } else {
            System.out.println("Area is larger than 20");
        }
    }
}

