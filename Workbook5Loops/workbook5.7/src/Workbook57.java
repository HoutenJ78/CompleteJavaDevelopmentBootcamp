public class Workbook57 {
    public static void main(String[] args) {

        // Task 1 – Make a for loop that counts from 0 to 18.
        for (int i = 0; i <= 100; i++) {



       /* Task 2

            Beside each number:
                 if it's a multiple of three, mark it as Fizz.
                 if it's a multiple of five, mark it as Buzz.
                 if it's a multiple of three and five, mark it as FizzBuzz.
         */
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }
}
