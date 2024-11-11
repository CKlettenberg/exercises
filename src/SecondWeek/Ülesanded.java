package SecondWeek;

import java.util.*;

public class Ülesanded {
    public static void main(String[] args) {

        //helloWorld1();
        //sõnadEraldi();
        //setNimekiri();
        //removeAllFunk();
        //eitus();
        //guessANumber();
        //harjutus();
        //mapping();
        //mapping1();
        //employeeSalary();
        compoundCalculator();
        //setVõimalused();
    }

    public static void helloWorld1() {
        String text = "Hello World";
        System.out.println(text.length());
        System.out.println(text.isBlank()); //peab tühi olema, tühik võib olla
        System.out.println(text.isEmpty()); //peab tühi olema
    }

    public static void sõnadEraldi() {
        String text = "Hello World Peeter Ükssarv";

        String[] sõnadEraldi = text.split("\\s+");
        for (String sõna : sõnadEraldi) {
            System.out.println(sõna);
        }
    }

    public static void setNimekiri() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sisesta lauseke: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split("\\s+");
        LinkedHashSet<String> uniqueWords = new LinkedHashSet<>();
        for (String word : words) {
            uniqueWords.add(word.toLowerCase());
        }
        System.out.println("Unikaalsed sõnkesed: " + uniqueWords);
        scanner.close();
    }

    public static void removeAllFunk() {

        System.out.println("Tähestik");
        Set<Character> words = new HashSet<>();

        for (char c = 'a'; c <= 'z'; c++) {
            words.add(c);
        }
        System.out.println(words);

        // versioon 1
        // Set<Character> vowels = Set.of('a','e','i','o','u');
        // words.removeAll(vowels);

        // versioon 2
        Set<Character> vovels = new HashSet<>();
        vovels.add('a');
        vovels.add('e');
        vovels.add('i');
        vovels.add('o');
        vovels.add('u');
        words.removeAll(vovels);

        System.out.println(words);
    }

    public static void eitus() {

        boolean isTrue = true;
        boolean isFalse = false;
        System.out.println(isTrue && !isFalse);
        //  == - võrdub
        //  != - ei võrdu
    }

    public static void guessANumber() {

        System.out.println("Guess a number between 1 and 50: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int correctNumber = 7;
        int maxAttempts = 5;

        for (int i = 1; i <= maxAttempts; i++) {
            if (number != correctNumber && i != maxAttempts) {
                System.out.println("Incorrect quess, try again!");
                number = scanner.nextInt();
            } else if (number == correctNumber) {
                System.out.println("Correct quess!");
                break;
            } else {
                System.out.println("Game Over!");
                break;
            }
        }
    }

    public static void harjutus() {

        Map<String, Integer> ages = new LinkedHashMap<>();
        ages.put("Mati", 20);
        ages.put("Kati", 25);
        ages.put("Tõnu", 30);

        for (String namekey : ages.keySet()) {
            System.out.println(namekey + " is " + ages.get(namekey) + " years old ");
        }
        for (String key : ages.keySet()) {
            System.out.println(key);
        }
        for (Integer value : ages.values()) {
            System.out.println(value);
        }
    }

    public static void mapping() {

        Map<String, String> worker = new LinkedHashMap<>();
        worker.put("Taavi", "Autojuht");
        worker.put("Kati", "Kraanajuht");
        for (String key : worker.keySet()) {
            System.out.println(key + " is " + worker.get(key));
        }
    }

    public static void mapping1() {
        Map<String, Integer> student = new LinkedHashMap<>();
        student.put("Joonas", 4);
        student.put("Taavi", 2);
        student.put("Kati", 1);


        System.out.println(student.get("Kati") + " grade is for student Kati");
        System.out.println(student.get("Taavi") + " grade is for student Taavi");
        System.out.println(student.get("Joonas") + " grade is for student Kati");
    }

    private static void employeeSalary() {


        Map<String, Double> salary = new LinkedHashMap<>();
        salary.put("Joonas", 1477.88);
        salary.put("Taavi", 1540.87);
        salary.put("Kati", 1210.99);

        System.out.println("Original Map" + salary);

        System.out.println("");
        salary.remove("Taavi");
        System.out.println("After removing \"Taavi\" : ");
        System.out.println("");

        System.out.println("Updated Map" + salary);
    }


    public static void compoundCalculator() {
        double principal = 1000;         // Principal amount in euros
        double rate = 0.10;              // Annual interest rate (9%)
        int compoundingsPerYear = 2;     // Compounded 4 times per year
        double years = 1;               // Invested for 10 years

        // Calculate the compound interest
        double amount = principal * Math.pow((1 + rate / compoundingsPerYear), compoundingsPerYear * years);

        // Display the result
        System.out.printf("The amount after %.2f years is: %.2f euros\n", years, amount);


    }

    public static void setVõimalused() {

        //1.Iterator
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(" ");

        //2.Converting to a List
        Set<String> setOfStrings = new HashSet<>();
        setOfStrings.add("Apple");
        setOfStrings.add("Banana");
        setOfStrings.add("Cherry");

        List<String> list = new ArrayList<>(setOfStrings); // Convert Set to List
        System.out.println(list.get(0));  // Access by index

        System.out.println(" ");


        //3.For-Each Loop
        for (String element : set) {
            System.out.println(element);
        }


    }
}





