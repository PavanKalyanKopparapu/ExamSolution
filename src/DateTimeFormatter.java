
import java.time.LocalDate;
import java.util.Scanner;

public class DateTimeFormatter {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Date : ");
            String UserDate = sc.next();

            LocalDate date = LocalDate.parse(UserDate);
            System.out.println(date);
            System.out.println("YEAR :" + date.getYear());
            System.out.println("MONTH :" + date.getMonth());
            System.out.println("DATE :" + date.getDayOfMonth());
            System.out.println("Week :" + date.getDayOfWeek());
        }
    }
