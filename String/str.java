package String;

public class str {
    public static void main(String[] args) {

        String s = "Sakin";
        System.out.println(s);
        s.concat("Islam"); // String are immutable
        System.out.println(s);

        String name = "Sachin";
        name = name.concat(" Tendulkar");
        System.out.println(name);

        byte ascii[] = { 71, 70, 70 };
        String firstString = new String(ascii);
        System.out.println(firstString);

        String secondString = new String(ascii, 1, 2);
        System.out.println(secondString);

        char characters[] = { 'G', 'f', 'g' };

        String firstStrings = new String(characters);
        String secondStrings = new String(firstString);
        System.out.println(firstStrings);
        System.out.println(secondStrings);

    }

}
