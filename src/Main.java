
public class Main {
    public static void main(String[] args) {

        System.out.print("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        spill("Twaijri");
    }

    public static void spill(String name) {
        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            System.out.println("i = " + letter);
        }
    }
}