import java.util.Scanner;

public class Workbook9 {
    public static void main(String[] args) {
        String username = "HenkvanHouten";
        String password = "JavaIsCool!";

        /* Task 1
            1. Pick up a username and password from the user.
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below\n");
        System.out.print("• Username: ");
        String inputName = scan.nextLine();

        //pick up username
        System.out.print("• Password: ");
        //pick up password
        String inputPassword = scan.nextLine();

        /* Task 2
            1. Set up a loop that keeps running while the username OR password is incorrect.
               When they get it wrong:
                •  println: \nIncorrect, please try again!\n
                •  get them to enter their username and password again
            2. After they enter the correct information, print:
                   \nSign in successful. Welcome!
       */

        while (!inputName.equals(username) && !inputPassword.equals(password)) {
            System.out.println("Your username or password is not correct, try again!");
            System.out.print("• Username: ");
            inputName = scan.nextLine();
            System.out.print("• Password: ");
            inputPassword = scan.nextLine();
        }

        System.out.println("\nSign in successful. Welcome!");

        scan.close();


    }
}
