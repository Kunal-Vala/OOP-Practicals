import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

class Practical1_1{

	public static void main(String arg[]) {
		String enrollmentNumber = "230130107054";
		LocalDateTime currentDateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println("Enrollment Number: " + enrollmentNumber);
		System.out.println("Current Date and Time: " + currentDateTime.format(formatter));
		Scanner Cin = new Scanner(System.in);
		System.out.println("Enter Value in meters :");
		float meter = Cin.nextFloat();
		float feet;
		feet = meter * 3.28084f;
		System.out.println(feet + "ft");

	}
}