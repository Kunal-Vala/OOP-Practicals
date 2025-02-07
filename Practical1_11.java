import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class PatternPrinter {
    public void printPattern1() {
        System.out.println("Pattern 1:");
        for (int i = 0; i < 4; i++) {
            for (int j = i; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printPattern2() {
        System.out.println("Pattern 2:");
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void printPattern3() {
        System.out.println("Pattern 3:");
        int num = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }

    public void printPattern4() {
        System.out.println("Pattern 4:");
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j < 4; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 2; i >= 0; i--) {
            for (int j = 0; j < 4 - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class Practical1_11 {
    public static void main(String[] args) {
        String enrollmentNumber = "230130107054";
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Enrollment Number: " + enrollmentNumber);
        System.out.println("Current Date and Time: " + currentDateTime.format(formatter));

        PatternPrinter printer = new PatternPrinter();
        printer.printPattern1();
        printer.printPattern2();
        printer.printPattern3();
        printer.printPattern4();
    }
}