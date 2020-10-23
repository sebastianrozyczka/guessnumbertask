 import java.util.Scanner;

public class GuessNumberMethods {
    Scanner scanner = new Scanner(System.in);
    public void guessNumber() {
        int number;
        do {
            System.out.println("Podaj liczbę: ");
            number = scanner.nextInt();
            checkNumber(number);
        } while (number > 200 || number < 100 || number % 3 != 0);
    }

    private void checkNumber(int number) {
        if(number < 100) {
            System.out.println("Twoja liczba jest mniejsza niż 100");
        }
        else if(number > 200) {
            System.out.println("Twoja liczba jest większa niż 200");
        }
        else if(number % 3 != 0) {
            System.out.println("Twoja liczba nie jest podzielna przez 3");
        }
        else {
            System.out.println("Trafiłeś ! Twoja liczba spełnia wszystkie warunki.");
        }
    }
}

