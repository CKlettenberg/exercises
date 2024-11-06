package DayThree;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {

        int [] m = new int[10];
        int [] m2 = {2,7,3,4};
        System.out.println(Arrays.toString(m));
        System.out.println(Arrays.toString(m2));

        int [] m1 = new int [10];
        int length = m.length;
        System.out.println(length);

        String [] carBrand = {"tesla", "honda","audi"};
        String [] carModel = {"Model S", "civic", "A3"};

        carModel[0] = "Model 3";

        Arrays.sort(carBrand);
        System.out.println(Arrays.toString(carBrand));

        System.out.println(carBrand[0] + " " + carModel[0]);
    }
}
