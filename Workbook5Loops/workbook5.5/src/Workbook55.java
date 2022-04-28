import java.util.Scanner;

public class Workbook55 {
    public static void main(String[] args) {
        System.out.println("I hear you like to count by threes\n");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...");
        Scanner scan = new Scanner(System.in);

      /* Task 1 – Get integers from the user.

          1.   print : Pick a number to count by:
               pick up the user's answer

          2.   print : Pick a number to start counting from:
               pick up the user's answer

          3.    print : Pick a number to count to:
                pick up the user's answer
        */
        System.out.print("\nPick a number to count by: ");
        int step = scan.nextInt();

        System.out.print("\nPick a number to start counting from: ");
        int start = scan.nextInt();

        System.out.print("\nPick a number to count to: ");
        int stop = scan.nextInt();


      /* Task 2 – Create a for loop that:
            1. starts from the second number.
            2. stops at the third number.
            3. counts in steps of the first.
      */
        for (int i = start; i <= stop; i+= step) {
            System.out.println(i);
        }
    }
}
