package SecondWeek;

public class Thursday2Week {
    public static void main(String[] args) {
    strExercise();


    }
    public static void strExercise(){
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");

        System.out.println(str1 == str2); //true
        System.out.println(str1 == str3); //false
        System.out.println(str1.equals(str3));  //true
    }
}
