package DayFour;

public class loop {
    public static void main(String[] args) {

        int count = 1;
        while (count <= 5) {
            System.out.println("count is: " + count);
            count++;
            System.out.println("count is after count++: " + count);
        }


        int count1 = 1;
        do {
            System.out.println("count is: " + count1);
            count1++;
        } while (count1 <= 5);

        for (int count2 = 1; count2 <= 5; count2++) {
            System.out.println("count: " + count2);
        }

        String fruits[] = {"apple", "banana", "orange"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

    }
}
