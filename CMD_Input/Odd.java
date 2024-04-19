package CMD_Input;

import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter a int....");
        int in = Input.nextInt();
        if (in % 2 == 0) {
            System.out.println("Input number is ODD");
        } else {
            System.out.println("input number is Even");
        }
        Input.close();

    }
}