package lab.lab09.Time;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        String times[] = {"15:20", "27:10", "16:78", "abc", "6:30"};
        
        for (String timeStr : times) {
            System.out.println("===");
            System.out.println("<<<TimeString for format converting in 24-hour notation is " + timeStr);
            
            try {
                outTime(timeStr);
            } catch (TimeFormatException e) {
                System.out.println(e.getMessage());
                continue;
            }
        }
        System.out.println("End of program");
    }

    public static void outTime(String line) throws TimeFormatException {
        SimpleDateFormat inputFormat = new SimpleDateFormat("HH:mm");
        SimpleDateFormat outputFormat = new SimpleDateFormat("hh:mm a");
        
        inputFormat.setLenient(false);
        
        try {
            Date date = inputFormat.parse(line);
            
            String result = outputFormat.format(date);
            
            System.out.println(">>>Time in 12-hour notation is: " + result);
            
        } catch (ParseException e) {
            String errorMessage = getDetailedErrorMessage(line, e);
            throw new TimeFormatException(errorMessage);
        }
    }
    
    private static String getDetailedErrorMessage(String timeStr, ParseException e) {
        if (!timeStr.matches(".*\\d.*")) {
            return "TimeFormatException: Invalid Value for Time!";
        }
        
        String[] parts = timeStr.split(":");
        if (parts.length != 2) {
            return "TimeFormatException: Invalid Value for Time!";
        }
        
        try {
            int hour = Integer.parseInt(parts[0]);
            int minute = Integer.parseInt(parts[1]);
            
            if (hour < 0 || hour > 23) {
                return "TimeFormatException: Invalid Value for Hour!";
            }
            
            if (minute < 0 || minute > 59) {
                return "TimeFormatException: Invalid Value for Minute!";
            }
            
            return "TimeFormatException: Invalid Value for Time!";
            
        } catch (NumberFormatException ex) {
            return "TimeFormatException: Invalid Value for Time!";
        }
    }
}