package L10L11;

import static L10L11.Greeting.greeting;

public class StringExample {
    public static void main(String[] args) {
        String message= greeting();
        System.out.println(message);

    }
    static String greeting(){
        String greeting = "Hello World!";
        return greeting;
    }
}