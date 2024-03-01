import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateDifference {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-uuuu");

        String firstDate = "22-11-1994";
        String secondDate = "06-09-2020";

        LocalDate dateOne = LocalDate.parse(firstDate,dateTimeFormatter);
        LocalDate dateTwo = LocalDate.parse(secondDate,dateTimeFormatter);

        long daysBetween = ChronoUnit.MONTHS.between(dateTwo,dateOne);

        System.out.println(daysBetween);

    }
}
