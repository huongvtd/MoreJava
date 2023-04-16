import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dateFormatter = dateTime.format(formatter);
        System.out.println(dateFormatter);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("EEEE, MMMM dd yy, HH:mm a");
        String dateFormatter2 = dateTime.format(formatter2);
        System.out.println(dateFormatter2);

        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd yy, HH:mm a");
        String dateFormatter3 = dateTime.format(formatter3);
        System.out.println(dateFormatter3);
    }
}
