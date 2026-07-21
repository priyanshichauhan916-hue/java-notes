package ArrayList;
//for taking input of 5 terms by for loop
import java.util.ArrayList;
import java.util.Scanner;

public class arraylist1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            list.add(in.nextInt());
            list.remove(0) ;



        }
    }
}