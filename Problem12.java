import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;

public class Problem12 {
    
  public static String getDay(String day, String month, String year) {
      
    int d = Integer.parseInt(day);
    int m = Integer.parseInt(month);
    int y = Integer.parseInt(year);
    
    Calendar cal = Calendar.getInstance();
    cal.set(y, m, d);
    System.out.print("Date And Time Is: " + cal.getTime()+"\n");
    int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

    String dayString = "";
    switch (dayOfWeek) {
            case 1:  dayString = "Sunday";
                     break;
            case 2:  dayString = "Monday";
                     break;
            case 3:  dayString = "Tuesday";
                     break;
            case 4:  dayString = "Wednedday";
                     break;
            case 5:  dayString = "Thursday";
                     break;
            case 6:  dayString = "Friday";
                     break;
            case 7:  dayString = "Saturday";
                     break;
            default: dayString = "Invalid day";
                     break;
        }

    return dayString;
        
  }
    
  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String month = in.next();
      String day = in.next();
      String year = in.next();
      
      System.out.println(getDay(day, month, year));
  }
}