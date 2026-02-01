package pri;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        //Q. Find the largest number among the three received from the user
//        int max=a;
//        if (b>max){
//            max=b;
//        }
//        if (c>max) {
//            max=c;
//        }
//            System.out.println(max+ " is the greatest");



//        int max=0;
//        if(a>b) {
//            max = a;
//        }else {
//            max = b;
//        }
//        if (c>max){
//            max=c;
//            System.out.println("max is "+max);
//        }

        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);
    }

}
