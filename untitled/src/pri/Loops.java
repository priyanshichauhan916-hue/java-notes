package pri;
import java.util.*;
public class Loops {
    public static void main(String[] args) {
        // Q: Print numbers from 1 to 5
        /* this is
        multi line
        comment
         */
        for (int num = 1; num <= 10; num++) {
            System.out.println(num);
        }
        System.out.println("theory");


        //Q. print numbers from 1 to 5
        for (int a = 1; a < 6; a++) {
            System.out.println(a);
        }
        System.out.println("first question");


        //Q. print numbers from 1 to n
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int k = 1; k <= n; k++) {
            System.out.print(k + " ");
        }
        System.out.println("second question");

        //Q. while loop structure
        int p=1;
        do{
            System.out.println("count"+p);
            p++;
        }while (p<6);
    }

}



