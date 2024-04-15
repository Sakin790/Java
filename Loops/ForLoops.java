package Loops;

public class ForLoops {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; i <= 5; j++) {
                if (j > i)
                    continue;
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
