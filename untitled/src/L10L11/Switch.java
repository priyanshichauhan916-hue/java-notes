package L10L11;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String fruits = i.nextLine();

        switch (fruits) {
            case "banana" -> System.out.println("Banana");
            case "apple" -> System.out.println("Apple");
            default -> System.out.println("valid input needed");
        }
//do option+return then enanced switch for this
        Scanner schedule = new Scanner(System.in);
        String days = schedule.nextLine();

        switch (days){
            case "mon", "tue", "wed", "thu", "fri" -> System.out.println("Weekday");
            case "sat", "sun" -> System.out.println("Weekend");
        }


    }
}
