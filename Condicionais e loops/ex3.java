import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("You will enter five numbers");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            numbers[i] = read.nextInt();
        }
        System.out.println("First the odd numbers");
        for (int i = 0; i < 5; i++) {
            if (numbers[i] % 2 != 0){
                System.out.println(numbers[i]);
            }
        }
        System.out.println("Now the even numbers");
        for (int i = 0; i < 5; i++) {
            if (numbers[i] % 2 == 0){
                System.out.println(numbers[i]);
            }
        }
    }
}