import Practise.PractiseEn;
import Practise.PractiseHu;
import java.util.*;
public class Main {
    static ImportFromSQL importFromSQL = new ImportFromSQL();
    static AskUser askUser = new AskUser();
    static PractiseEn practiseEn = new PractiseEn();
    static PractiseHu practiseHu = new PractiseHu();
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            importFromSQL.importData();
            int userNumber = askUser.askForLanguage(scanner);
            scanner.nextLine();

            switch (userNumber) {
                case 1 -> practiseEn.practiseWords(importFromSQL.getEN_WORDS(), importFromSQL.getHU_WORDS(), scanner);
                case 2 -> practiseHu.practiseWords(importFromSQL.getEN_WORDS(), importFromSQL.getHU_WORDS(), scanner);
            }
        }
    }
}