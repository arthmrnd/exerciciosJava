import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a word to be reversed");
        String word = read.next();
        String reversedWord = "";
        int realLength = word.length() - 1;

        for (int i = realLength; i >= 0; i--) {
            reversedWord = reversedWord + word.charAt(i);
        }

        System.out.println("Word reversed is - " + reversedWord);

    }
}