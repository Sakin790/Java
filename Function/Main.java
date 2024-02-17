import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // I just define type before value set
        int num1, num2;
        System.out.print("Enter first number :");
         num1 = in.nextInt();
        System.out.print("Enter 2nd number: ");
         num2 = in.nextInt();
        System.out.print("Sum is ");
        int sum = (num2 + num1);
        System.out.println(sum);
    }
}