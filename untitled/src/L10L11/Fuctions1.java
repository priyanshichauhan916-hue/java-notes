//Q. take two numbers and sum them,
// do this whole process 10 times

package L10L11;
import java.util.Scanner;

public class Fuctions1 {
    public static void main(String[] args) {
        sum();
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num1 = in.nextInt();
        System.out.print("Enter an integer: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("the sum is " + sum);
    }
}