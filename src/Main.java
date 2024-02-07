
public class Main {
    public static void main(String[] args) {

        System.out.print("Hello and welcome!");
        System.out.println("Abdulaziz Altwaijri");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        spill("Twaijri");
        System.out.println("Even or odd? " + meathod(100));
    }

    public static void spill(String name) {
        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            System.out.println("i = " + letter);
        }
    }

    public static String meathod(int num) {
        if (num % 2 == 0)
            return "Even";
        else return "Odd";
    }
}