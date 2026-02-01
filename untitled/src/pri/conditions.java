package pri.conditions;
import java.util.*;
public class conditions  {
    public static void main(String[] args) {
        /* Basic if statements*/

        int salary = 25000;
        if (salary > 10000){
            salary = salary + 1000;
        } else {
            salary = salary + 2000;
        }
        System.out.println("Bonus salary: " + salary);

    }
}