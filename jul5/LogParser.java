import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogParser {
    public static void main(String[] args) {
        String logFilePath = "C:\Users\HP\Desktop\Assignment 1\trace.log";
        String targetJob = "J1";
        String targetTimestampString = "2023-06-29 04:04:04";

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date targetTimestamp;

        try {
            targetTimestamp = dateFormat.parse(targetTimestampString);
        } catch (ParseException e) {
            System.out.println("Invalid timestamp format.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(logFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ", 4);
                if (parts.length < 4) {
                    continue; // Skip malformed log entries
                }

                Date logTimestamp;
                try {
                    logTimestamp = dateFormat.parse(parts[0] + " " + parts[1]);
                } catch (ParseException e) {
                    continue; // Skip malformed timestamps
                }

                String jobName = parts[2];
                if (logTimestamp.after(targetTimestamp) && jobName.equals(targetJob)) {
                    System.out.println(line);
                    return;
                }
            }

            System.out.println("No matching log entry found.");
        } catch (IOException e) {
            System.out.println("Error reading the log file.");
        }
    }
}
