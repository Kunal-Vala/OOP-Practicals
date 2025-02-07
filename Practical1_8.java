import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class CurrencyCalculator {
    private int amount;
    private int[] denominations = {100, 50, 10, 5, 2, 1};
    private int[] notes;

    public CurrencyCalculator(int amount) {
        this.amount = amount;
        this.notes = new int[denominations.length];
    }

    public void calculateNotes() {
        for (int i = 0; i < denominations.length; i++) {
            notes[i] = amount / denominations[i];
            amount %= denominations[i];
        }
    }

    public void displayNotes() {
        System.out.println("Currency notes required:");
        for (int i = 0; i < denominations.length; i++) {
            System.out.println(denominations[i] + ": " + notes[i]);
        }
    }
}

public class Practical1_8 {
    public static void main(String[] args) {
        String enrollmentNumber = "230130107054";
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Enrollment Number: " + enrollmentNumber);
        System.out.println("Current Date and Time: " + currentDateTime.format(formatter));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to be withdrawn: ");
        int amount = scanner.nextInt();
        scanner.close();

        CurrencyCalculator calculator = new CurrencyCalculator(amount);
        calculator.calculateNotes();
        calculator.displayNotes();
    }
}