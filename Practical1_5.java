import java.util.Scanner;

class Practical1_4 {
    public static void main(String[] args) {
        double pound, inches, kilogram, meter, BMI;

        Scanner cin = new Scanner(System.in);

        System.out.print("Enter Weight In Pounds: ");
        pound = cin.nextDouble();

        System.out.print("Enter Height in Inches: ");
        inches = cin.nextDouble();

        kilogram = pound * 0.453592;

        meter = inches * 0.0254;

        BMI = kilogram / (meter * meter);

        String formattedBMI = String.format("%.2f", BMI);

        System.out.println("Your BMI is: " + formattedBMI);

        cin.close();
    }
}