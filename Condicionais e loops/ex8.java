import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("\t-Body Mass Index-");
        String[] name = new String[5];
        double[] bmi = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a name");
            name[i] = read.next();
            System.out.println("Enter the height in Meters");
            float height = read.nextFloat();
            System.out.println("Enter the weight in Kilograms");
            float weight = read.nextFloat();

            bmi[i] = weight / (Math.pow(height,2));
        }
        for (int i = 0; i < 5; i++) {
            if (bmi[i] < 18.5 || bmi[i] > 25) {
                System.out.printf("%s is out of the ideal weight\n",name[i]);
            }
        }
    }
}