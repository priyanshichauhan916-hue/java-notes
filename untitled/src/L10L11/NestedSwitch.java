package L10L11;
import java.util.*;
public class NestedSwitch {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int empID= in.nextInt();
        String Department = in.next();

        switch(empID){
            case 1:
                System.out.println("eetal chauhan");
                break;
            case 2:
                System.out.println("kalra");
                break;
            case 3:
                System.out.println("kalan");

                switch(Department){
                    case "mac":
                        System.out.println("mac dept");
                        break;
                    case "bsc":
                        System.out.println("bsc dept");
                        break;
                    case "cse":
                        System.out.println("cse dept");
                        break;
                    default:
                        System.out.println("invalid input");

                        //there is some error in it
        }



        }
    }
}
