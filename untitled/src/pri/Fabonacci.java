package pri;
import java.util.Scanner;
public class Fabonacci {
    public static void main(String[] args) {
        //Q. find the 'n'th fibonacci number.
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int count =2;
                //while condition
        while(count<n) {
            int temp = b;
            b = a + b;
            a = temp;
            count++;

        }

            System.out.println(b);



    }

}