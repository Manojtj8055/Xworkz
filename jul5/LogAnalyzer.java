import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.application.Application;

public class LogAnalyzer {
 public static void main(String[] args) {
        String logFilePath = "trace.log";
        String targetJob = "J1";
        String targetTimestamp = "2023-06-29 04:04:04";

        try (BufferedReader reader = new BufferedReader(new FileReader(logFilePath))) {
            String line;
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date targetDate = dateFormat.parse(targetTimestamp);
            Date firstLogDate = null;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ", 4);
                String logTimestamp = parts[0] + " " + parts[1];
                Date logDate = dateFormat.parse(logTimestamp);

                if (logDate.after(targetDate) && parts[2].equals(targetJob)) {
                    firstLogDate = logDate;
                    break;
                }
            }

            if (firstLogDate != null) {
                System.out.println("First log of " + targetJob + " after " + targetTimestamp + ":");
                System.out.println("Timestamp: " + dateFormat.format(firstLogDate));
                System.out.println("Log: " + line);
            } 
			else {
                System.out.println("No log found for " + targetJob + " after " + targetTimestamp);
			}
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}