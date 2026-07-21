package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class arraylist2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i =0; i<5; i++){
            list.add(new ArrayList<>());
        }
        for(int j=0;j<5;j++){
            list.get(j).add(in.nextInt());
        }
        System.out.println(list);


    }
}
