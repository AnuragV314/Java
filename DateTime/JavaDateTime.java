package DateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaDateTime {
    public static void main(String[] args) {
        LocalDate localdate = LocalDate.now();
        System.out.println(localdate);

        LocalTime localtime = LocalTime.now();
        System.out.println(localtime);

        LocalDateTime localdatetime = LocalDateTime.now();
        System.out.println(localdatetime);

        System.out.println("Before formatting: " + localdatetime);

        DateTimeFormatter datetimeformatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = localdatetime.format(datetimeformatter);
        System.out.println("Afer formatting: " + formattedDate);
    }
}

/*
 The ofPattern() method accepts all sorts of values, 
 if you want to display the date and time in a different format. 
 For example:

Value	Example	

yyyy-MM-dd	"1988-09-29"	
dd/MM/yyyy	"29/09/1988"	
dd-MMM-yyyy	"29-Sep-1988"	
E, MMM dd yyyy	"Thu, Sep 29 1988"
 */
