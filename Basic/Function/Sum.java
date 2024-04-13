import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
        gretings();
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter first number :");
        num1 = in.nextInt();
        System.out.print("Enter 2nd number: ");
        num2 = in.nextInt();
        System.out.print("Sum is ");
        int sum = (num2 + num1);
        System.out.println(sum);
    }

    static void gretings() {
        System.out.println("Hello worlds");
    }
}

public class Paramiter {
    public static void main(String[] args) {
       int ans =  num(2,3);
        System.out.println(ans);
    }

    static int num(int a, int b){
        int sum = a + b ;
        return sum;
    }
}