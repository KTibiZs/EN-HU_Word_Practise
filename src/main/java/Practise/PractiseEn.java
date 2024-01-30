package Practise;

import java.util.Objects;
import java.util.Scanner;

public class PractiseEn implements Practise {
    private int lastIndex = 0;

    @Override
    public void practiseWords(String[] enWords, String[] hunWords, Scanner scanner) {
        boolean exit;
        do {
            int index = (int) Math.floor(Math.random() * enWords.length);

            // for the user don't get the same word over and over
            if (lastIndexChecker(index)) {
                practiseWords(enWords, hunWords, scanner);
            }

            // initialisation for next iteration
            lastIndex = index;

            // ask user for tho opposite language word
            String userWord = askUser(enWords, index, scanner);

            // set exit condition
            exit = Objects.equals(userWord, "");

            // check user answer
            if (exit) {
                System.out.println("Good Bye!");
                System.exit(1);
            }
            if (Objects.equals(userWord, hunWords[index])) {
                System.out.println("correct!");
            } else {
                System.out.println("Not correct, the answer is: " + hunWords[index]);
            }
        } while (true);
    }

    @Override
    public boolean lastIndexChecker(int index) {
        return lastIndex == index;
    }

    @Override
    public String askUser(String[] enWords, int index, Scanner scanner) {
        String actualWord = enWords[index];
        System.out.print(actualWord + " means: ");
        return scanner.nextLine();
    }
}
