import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

class NumberSorter {
    private int[] numbers;

    public NumberSorter(int[] numbers) {
        this.numbers = numbers;
    }

    public void sortDescending() {
        Arrays.sort(numbers);
    }

    public void displayNumbers() {
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}

public class Practical1_6 {
    public static void main(String[] args) {
        String enrollmentNumber = "230130107054";
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Enrollment Number: " + enrollmentNumber);
        System.out.println("Current Date and Time: " + currentDateTime.format(formatter));

        Scanner cin = new Scanner(System.in);

        int[] arr = new int[3];
        System.out.print("Enter three numbers: ");
        arr[0] = cin.nextInt();
        arr[1] = cin.nextInt();
        arr[2] = cin.nextInt();

        NumberSorter sorter = new NumberSorter(arr);
        sorter.sortDescending();
        sorter.displayNumbers();

        cin.close();
    }
}