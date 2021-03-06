package practicingwithdates;

import java.text.DateFormat;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalField;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.text.DateFormatter;

/**
 *This Utility is designed to help people access a program that will help them convert 
 * dates that will help them with other projects.
 * @author tduwe
 */
public class DateUtilities {

//    public LocalDateTime getCurrentDateTime(){
//        return LocalDateTime.now();
//    }
    
    /**
     * 
     * @returns the duration between now and a specified day of the month or day 
     * of the year
     */
    public Duration getDateDiff(){
        LocalDateTime startDate = LocalDateTime.now();
        LocalDateTime endDate = LocalDateTime.of(2015, Month.OCTOBER, 27, 15, 35);
        Duration diff = Duration.between(startDate, endDate);
        return diff;
       
    }
    /**
     * This is a fun method to get the date from Five Days from right now, two hours behind
     * @return date that is five days in the future and is two hours behind the time right now
     */
    public LocalDateTime getFiveDaysFromNowTwoHoursAgo(){
       LocalDateTime now = LocalDateTime.now();
        LocalDateTime dueDate = now.plusDays(5).minusHours(2);
        return dueDate;
    }
    /**
     * This method returns a date and time and formats it in a string
     * @param date
     * @returns a formatted date
     */
   public String toString(LocalDateTime date){
       DateTimeFormatter df = DateTimeFormatter.ISO_DATE_TIME;
       return df.format(date);   
     
   }
   /**
    * This method returns a date from different time zones
    * @param d
     * @return 
    * @returns the date and time formatted
    */
   public String toString(LocalDate d){
       DateTimeFormatter formats = DateTimeFormatter.ISO_DATE_TIME;
       return formats.format(d);
   }
   /**
    * This method sets a Formatter to change the appearance of a date.  It can than be 
    * changed 
    * @param it
    * @returns the string
    */
    
   public LocalDate toDate(String it){
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	LocalDate mine = LocalDate.parse(it, formatter);
        return mine;	
	
   }
   /**
    * This method changes the format of the date entered and allows the format to be changed later
    * @param time
    * @return the format created in the formatter 
    */
   public LocalDateTime toDateTime(String time){
       DateTimeFormatter formats = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"); 
       LocalDateTime ours= LocalDateTime.parse(time,formats);
       return ours;
       
   }
  
    public static void main(String[] args) {
        DateUtilities app = new DateUtilities();
//        LocalDateTime date = app.getCurrentDateTime();
//        System.out.println(date);
        
//        Duration diff = app.getDateDiff();
//        System.out.println(diff.toMinutes() + " minutes to go til date entered");
//        System.out.println(diff.toDays()+ " days til the date entered");
//        System.out.println(" ");
//        
//        LocalDateTime dueDate = app.getFiveDaysFromNowTwoHoursAgo();
//        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MM.dd.yyyy  hh:mm a");
//        System.out.println(dueDate.format(fmt) + " is exactly 5 days ahead/ 2 hours behind");
//        
//        
//        System.out.println(" ");
//        
//           LocalDate date = app.toDate("1985-10-18");
//           System.out.println(date.format(DateTimeFormatter.ofPattern("MM-dd-yyyy")));
//           LocalDateTime date2 = app.toDateTime("1985-10-18 08:22");
//           System.out.println(date2.format(DateTimeFormatter.ofPattern("mm:HH dd-yyyy-MM")));
//        
        Duration diff = app.getDateDiff();
        System.out.println(diff.toMinutes()*60 + " seconds");
        
//        
    }
   

    
    
}
