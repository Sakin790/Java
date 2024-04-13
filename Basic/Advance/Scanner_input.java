package Advance;

import java.util.Scanner;

public class Scanner_input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height = input.nextInt();
        int weight = input.nextInt();

        int sum = height + weight;
        System.out.println(sum);

    }
}
