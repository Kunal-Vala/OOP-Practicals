import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double calculateArea() {
        double semip = (side1 + side2 + side3) / 2;
        return Math.sqrt(semip * (semip - side1) * (semip - side2) * (semip - side3));
    }
}

public class Practical1_10 {
    public static void main(String[] args) {
        String enrollmentNumber = "230130107054";
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Enrollment Number: " + enrollmentNumber);
        System.out.println("Current Date and Time: " + currentDateTime.format(formatter));

        Scanner cin = new Scanner(System.in);

        System.out.println("Enter Sides of Triangle:");
        double side1 = cin.nextDouble();
        double side2 = cin.nextDouble();
        double side3 = cin.nextDouble();

        Triangle triangle = new Triangle(side1, side2, side3);
        double area = triangle.calculateArea();

        String formattedArea = String.format("%.2f", area);
        System.out.println("Area = " + formattedArea);

        cin.close();
    }
}