public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a;
        a = b;
        b = c;

        System.out.println("Value of a is now" + " " + a);
        System.out.println("Value of a is now" + " " + b);
    }
}
