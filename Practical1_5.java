import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Person {
    private double weightInPounds;
    private double heightInInches;

    public Person(double weightInPounds, double heightInInches) {
        this.weightInPounds = weightInPounds;
        this.heightInInches = heightInInches;
    }

    public double calculateBMI() {
        double weightInKilograms = weightInPounds * 0.453592;
        double heightInMeters = heightInInches * 0.0254;
        return weightInKilograms / (heightInMeters * heightInMeters);
    }
}

public class Practical1_5 {
    public static void main(String[] args) {
        String enrollmentNumber = "230130107054";
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Enrollment Number: " + enrollmentNumber);
        System.out.println("Current Date and Time: " + currentDateTime.format(formatter));

        Scanner cin = new Scanner(System.in);

        System.out.print("Enter Weight In Pounds: ");
        double pound = cin.nextDouble();

        System.out.print("Enter Height in Inches: ");
        double inches = cin.nextDouble();

        Person person = new Person(pound, inches);
        double BMI = person.calculateBMI();
        String formattedBMI = String.format("%.2f", BMI);

        System.out.println("Your BMI is: " + formattedBMI);

        cin.close();
    }
}