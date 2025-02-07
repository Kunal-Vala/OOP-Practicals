import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class NumberProcessor {
    private int number;

    public NumberProcessor(int number) {
        this.number = number;
    }

    public int processNumber() {
        int temp = 1;
        for (int i = 1; i <= 5; i++) {
            number = number + temp;
            temp = temp * 10;
        }
        return number;
    }
}

public class Practical1_9 {
    public static void main(String[] args) {
        String enrollmentNumber = "230130107054";
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Enrollment Number: " + enrollmentNumber);
        System.out.println("Current Date and Time: " + currentDateTime.format(formatter));

        Scanner cin = new Scanner(System.in);
        System.out.print("Enter Five Digit Number: ");
        int num = cin.nextInt();
        cin.close();

        NumberProcessor processor = new NumberProcessor(num);
        int result = processor.processNumber();

        System.out.println("Ans is: " + result);
    }
}