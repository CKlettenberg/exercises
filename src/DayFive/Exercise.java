package DayFive;

public class Exercise {
    public static void main(String[] args) {
        Car canInOtherClass1 = new Car();
        System.out.println(canInOtherClass1.brand);
        Car canInOtherClass2 = new Car("Honda","Civic",2010);
        System.out.println(canInOtherClass2.brand);
        System.out.println(canInOtherClass2);

    }


}
