import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        sum();
        gretings();
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter first number :");
        num1 = in.nextInt();
        System.out.print("Enter 2nd number: ");
        num2 = in.nextInt();
        System.out.print("Sum is ");
        int sum = (num2 + num1);
        System.out.println(sum);
        in.close();
    }
    static  void gretings (){
        System.out.println("Hello worlds");
    }
}
