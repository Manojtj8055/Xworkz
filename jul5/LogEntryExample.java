import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogEntryExample {
    public static void main(String[] args) {
        
        LocalDateTime now = LocalDateTime.now();

        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("2023-06-29 04:04:04");

       
        String formattedDateTime = now.format(formatter);

        
        String logEntry = "S1:" + formattedDateTime;

       
        System.out.println(logEntry);
    }
}
