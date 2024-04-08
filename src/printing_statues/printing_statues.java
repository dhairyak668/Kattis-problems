package printing_statues;
/**
 * @author Dhairya Kachalia
 * net id: dhairyk@iasate.edu
 * question: https://open.kattis.com/problems/3dprinter
 */
import java.util.Scanner;
public class printing_statues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeToPrintItems = 1;
        int numberOfPrinters = 1;

        int statuesToPrint = scanner.nextInt();

        int days = 0;

        while (true) {
            days += timeToPrintItems;
            int newPrintersToAdd = 0;
            int numberOfStatuesToPrint = 0;

            for (int i = 0; i < numberOfPrinters; i++) {
                if (numberOfPrinters * 2 < statuesToPrint) {
                    newPrintersToAdd += 1;
                } else {
                    numberOfStatuesToPrint += 1;
                }
            }

            numberOfPrinters += newPrintersToAdd;
            statuesToPrint -= numberOfStatuesToPrint;
            if (statuesToPrint <= 0) break;
        }

        System.out.println(days);
        scanner.close();
    }
}