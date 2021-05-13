import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        System.out.println("\tWelcome to the market");
        Scanner read = new Scanner(System.in);
        String[] fruits = new String[5];
        for (int i = 0; i < 5; i++){
            System.out.println("Enter a fruit to the shopping cart");
            fruits[i] = read.next();
        }
        System.out.println("Fruits in the shopping cart");
        for (int i = 0; i < 5; i++){
            System.out.println(fruits[i]);
        }
    }
}