package DayThree;


public class Hello {
    public static void main(String[] args) {
        getPerson();

    }

    public static void getPerson() {
        System.out.println("Checking user age");
        getName();
        checkUserAge();
    }

    public static void getName() {
        System.out.println("John");

    }

    public static void checkUserAge() {
        int age = 20;
        if (age < 18) {
            System.out.println("You are younger than 18 years!");

        } else {
            getAge(age);

        }
    }

    public static void getAge(int age) {
        System.out.println("Age is : " + age );

    }

}