package CMD_Input;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter a String Valus...");
        Boolean name = Input.nextBoolean();
        System.out.println("String value is" + name);
        Input.close();

    }
}
