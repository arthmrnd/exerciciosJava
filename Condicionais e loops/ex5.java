import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        System.out.println("\tFill the guests list!");
        Scanner read = new Scanner(System.in);
        String[] names = new String[5];
        int high = 0;
        for (int i = 0; i < 5; i++){
            System.out.println("Enter a guest to list");
            names[i] = read.next();
            if (names[i].length() > names[high].length()) {
                high = i;
            }
        }
        System.out.println("The name with the largest extension is " + names[high]);
    }
}