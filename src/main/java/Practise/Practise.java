package Practise;

import java.util.Scanner;

public interface Practise {
    void practiseWords(String[] enWords, String[] hunWords, Scanner scanner);
    boolean lastIndexChecker(int index);
    String askUser(String[] enWords, int index, Scanner scanner);
}
