public class UnitDigit {
    public static void main(String[] args) {
        // Print last digit of a number stored in a variable
        int x = 3244255;
        int unitDegit = x % 10;
        System.out.println(unitDegit);
        // Print without last digit of a number stored in a variable
        int y = 1345;
        int withOutlastDigit = y / 10;
        System.out.println(withOutlastDigit);

    }
}
