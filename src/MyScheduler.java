import java.util.Scanner;

public class MyScheduler {
    public static void main(String[] args) {
        //arrayNR();
        //temp();
        //calcDailyAverage();
        maxTempOfDay();

    }

    public static void arrayNR() {
        int[] regularArray = new int[10];

        int[][] numbers = {
                {1, 2, 3, 4}, //row 0
                {5, 6, 7, 8}, // row 1
                {9, 10, 11, 12}, // ro2
        };

        int num7 = numbers[1][2];
        System.out.println(num7);
    }


    private static void temp() {
        double[][] temperatures = {

                {22.5, 25.0, 20.0},
                {24.0, 26.5, 21.5},
                {23.0, 27.0, 22.0},
        };

        double temp1 = temperatures[0][0];
        double temp2 = temperatures[2][1];
        System.out.println(temp1);
        System.out.println(temp2);
    }

    public static void calcDailyAverage() {
        double[][] temperatures = {
                {22.5, 25.0, 20.0},
                {24.0, 26.5, 21.5},
                {23.0, 27.0, 22.0},
        };
        for (int row = 0; row < temperatures.length; row++) {
            double sum = 0;
            for (int column = 0; column < temperatures[row].length; column++) {
                sum += temperatures[row][column];
            }
            double average = sum / temperatures[row].length;
            System.out.println("Average temperature for day  " + (row + 1) + ": " + average);

        }



    }
    public static void maxTempOfDay() {
        System.out.println("Enter the day (1-3), and I will tell you the maximum temperature:");
        Scanner scanner = new Scanner(System.in);

        int day = scanner.nextInt();

        // Ensure input is valid (1-3)
        if (day < 1 || day > 3) {
            System.out.println("Invalid day. Please enter a number between 1 and 3.");
            return;
        }

        double[][] temperatures = {
                {22.5, 25.0, 20.0}, // Day 1
                {24.0, 26.5, 21.5}, // Day 2
                {23.0, 27.0, 22.0}  // Day 3
        };

        // Get the temperatures for the selected day
        double[] selectedDayTemperatures = temperatures[day-1];

        // Find the maximum temperature
        double maxTemp = selectedDayTemperatures[0];
        for (int i = 1; i < selectedDayTemperatures.length; i++) {
            if (selectedDayTemperatures[i] > maxTemp) {
                maxTemp = selectedDayTemperatures[i];
            }
        }

        System.out.println("The maximum temperature for day " + day + " is: " + maxTemp);
    }


}
