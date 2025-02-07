import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Practical1_1{

	public static void main(String arg[]){
		
	String enrollmentNumber = "230130107054";
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Enrollment Number: " + enrollmentNumber);
        System.out.println("Current Date and Time: " + currentDateTime.format(formatter));
	System.out.println("Welcome to Java.Learning Java Now and Programming is Fun");	



	}
}