package pri;
import java.util.Scanner;
public class CountNums {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n = input.nextInt();

        int count=0;
        while(n>0){
            int rem=n%10;
            if (rem==5){
                count++;
            }
            n=n/10;
            System.out.println(n);

        }
    }
}
// ye wala mujhe jyada smjh nhi aaya, im bored asf now.