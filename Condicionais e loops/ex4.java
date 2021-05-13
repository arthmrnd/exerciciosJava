import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float[] numbers = new float[5];
        float mean, high = 0, low = 0, sum = 0;
        System.out.println("You will enter five numbers");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            numbers[i] = read.nextFloat();
            if (numbers[i] > high) {
                high = numbers[i];
            }
            if (low == 0) {
                low = numbers[i];
            }
            if (numbers[i] < low) {
                low = numbers[i];
            }
            sum = sum + numbers[i];
        }

        mean = sum/numbers.length;
        System.out.printf("The highest is %.2f\nThe lowest is %.2f\nThe mean is %.2f",low,high,mean);
    }
}