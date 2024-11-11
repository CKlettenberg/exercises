package DayFive;

import java.util.ArrayList;
import java.util.List;

public class Listexercises {
    public static void main(String[] args) {
        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("alex");
        listOfNames.add("bob");
        listOfNames.add("charlie");

        for (String name : listOfNames) {
            System.out.println(name);
        }
        listOfNames.remove("bob");
        System.out.println(" ");

        System.out.println("print out name: " + listOfNames.get(0));
        System.out.println("print out name: " + listOfNames.get(1));
        System.out.println("print out name: " + listOfNames.get(2));
        System.out.println(" ");
        listOfNames.set(1, "John");
        System.out.println("names after modification: " + listOfNames);
        listOfNames.remove("charlie");
        System.out.println("names after removing: " + listOfNames);



    }
}



