public class Practical1_3 {
    public static void main(String[] args) {
        
        double a = 3.4;
        double b = 50.2;
        double e = 44.5;
        double c = 2.1;
        double d = 0.55;
        double f = 5.9;

        // Calculate the denominator (ad - bc)
        double denominator = (a * d) - (b * c);

        // Check if the denominator is zero (which means the system has no unique solution)
        if (denominator == 0) {
            System.out.println("The system has no unique solution.");
        } else {
            // Calculate x and y using Cramer's rule
            double x = (e * d - b * f) / denominator;
            double y = (a * f - e * c) / denominator;

            String formattedX = String.format("%.2f", x);
            String formattedY = String.format("%.2f", y);

            System.out.println("x = " + formattedX);
            System.out.println("y = " + formattedY);
        }
    }
}