package Assignment_03;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        if (N % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("N is Odd Number");
        }

        in.close();
    }
}