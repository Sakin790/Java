package OOPS;

public class Box {
    int length, width, height;// intance variable (Object variables)

    void setDimention(int x, int y, int z) {//local variable
        length = x;
        width = y;
        height = z;
    }

    void showDimention() {
        System.out.println("Length" + "" + length);
        System.out.println("Length" + "" + width);
        System.out.println("Length" + "" + height);
    }

    void sumDimention(int x, int y, int z) {
        length = x;
        width = y;
        height = z;
        int sum = length + width + height;
        System.out.println(sum);
    }
}

