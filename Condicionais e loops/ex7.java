import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] age = new int[5];
        String[] name = new String[5];
        float mean, sum = 0;
        int high = 0, low = 0, iHigh=0, iLow=0;
        System.out.println("Enter the name and their age");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the name");
            name[i] = read.next();
            System.out.println("Enter the age");
            age[i] = read.nextInt();
            if (age[i] > high) {
                high = age[i];
                iHigh = i;
            }
            if (low == 0) {
                low = age[i];
                iLow = i;
            }
            if (age[i] < low) {
                low = age[i];
                iLow = i;
            }
            sum = sum + age[i];
        }

        mean = sum/age.length;
        System.out.printf("The youngest is %s with %d years old\n",name[iLow],low);
        System.out.printf("The oldest is %s with %d years old\n",name[iHigh],high);
        System.out.printf("The average age is %.2f years old\n",mean);
    }
}