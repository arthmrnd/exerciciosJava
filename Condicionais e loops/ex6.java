import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = read.next();
        String newWord = "";

        for (int i = 0; i < word.length(); i++) {
            if (i % 2 == 0){
                newWord = newWord + Character.toUpperCase(word.charAt(i));
            }
            else {
                newWord = newWord + word.charAt(i);
            }
        }
        System.out.println(newWord);
    }
}