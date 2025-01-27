import java.util.Scanner;

public class Practical1_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to be withdrawn: ");
        int amount = scanner.nextInt();
        scanner.close();

        int[] denominations = {100, 50, 10, 5, 2, 1};
        int[] notes = new int[denominations.length];

        for (int i = 0; i < denominations.length; i++) {
            notes[i] = amount / denominations[i];
            amount %= denominations[i];
        }

        System.out.println("Currency notes required:");
        for (int i = 0; i < denominations.length; i++) {
            System.out.println(denominations[i] + ": " + notes[i]);
        }
    }
}

