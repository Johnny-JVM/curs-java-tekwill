package homework10Scanner;
import java.util.Scanner;

public class Scannner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int positiveC = 0;
        int negativeC = 0;
        int summa = 0;

        while (true){
            System.out.println("Введите число 0 для завершения программы-_-");
            int number = scanner.nextInt();

            if (number == 0){
                break;
            }
            if (number > 0){
                positiveC++;
            }
            else {
                negativeC++;
            }
            summa += number;

            System.out.println("Positive- " + positiveC + "\n"
                    + "Negative- " + negativeC +"\n"
                    + "Sum- " + summa
            );
        }
    }
}
