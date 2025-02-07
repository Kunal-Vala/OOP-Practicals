import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class CharacterChecker {
    private char character;

    public CharacterChecker(char character) {
        this.character = character;
    }

    public boolean isVowel() {
        return character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ||
               character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U';
    }

    public void displayResult() {
        if (isVowel()) {
            System.out.println("Your Character is a Vowel");
        } else {
            System.out.println("Your Character is a Consonant");
        }
    }
}

public class Practical1_7 {
    public static void main(String[] args) {
		String enrollmentNumber = "230130107054";
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Enrollment Number: " + enrollmentNumber);
        System.out.println("Current Date and Time: " + currentDateTime.format(formatter));
		
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter the character: ");
        char chr = cin.next().charAt(0);

        CharacterChecker checker = new CharacterChecker(chr);
        checker.displayResult();

        cin.close();
    }
}