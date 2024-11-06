package DayThree;


public class Hello {
    public static void main(String[] args) {
        int age = 20;
        getPerson(age);

    }

    public static void getPerson(int age) {
        System.out.println("Checking user age");
        getName();
        checkUserAge(age);
    }

    public static void getName() {
        System.out.println("John");

    }

    public static void checkUserAge(int age) {
        if (age < 18) {
            System.out.println("You are younger than 18 years!");

        } else {
            getAge(age);

        }
    }

    public static void getAge(int age) {
        System.out.println("Age is : " + age);

    }

}