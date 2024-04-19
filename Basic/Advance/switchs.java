package Advance;

import java.util.Scanner;

public class switchs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Day = in.nextInt();

        switch (Day) {
            case 1:
                System.out.println("Day 1");
                break;
            case 2:
                System.out.println("Day 2");
                break;
            default:
                System.out.println("Please inter a number:");
                break;
        }
        in.close();
    }
}
