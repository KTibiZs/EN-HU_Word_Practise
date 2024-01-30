import java.util.Scanner;
public class AskUser {

    public int askForLanguage(Scanner scanner) {
        boolean exit;
        int userNumber;
        do {
            System.out.println("Chose what you want to practise:\n1. English words\n2. Hungarian words");
            userNumber = scanner.nextInt();

            exit = userNumber == 1 | userNumber == 2;
            if (!exit) {
                System.out.println("You can choose: 1 or 2");
            }

        }while (!exit);

        return userNumber;
    }
}
