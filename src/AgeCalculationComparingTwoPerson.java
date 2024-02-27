import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculationComparingTwoPerson {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Person 1 name: ");
        String personOne = sc.nextLine();

        System.out.println("Hello " + personOne + "! The Birth year should not less then 1900, future and negative value.");
        System.out.println("Enter " + personOne + "'s date of birth in DD/MM/YYYY format: ");
        String personOneDateOfBirth = sc.nextLine();

        AgeCalculationComparingTwoPerson ageCalculationComparingTwoPerson = new AgeCalculationComparingTwoPerson();
        boolean dateCheckResult = ageCalculationComparingTwoPerson.dateValidationCheck(personOneDateOfBirth);
        System.out.println(dateCheckResult);

    }

    public static boolean dateValidationCheck(String personDateOfBirth) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        try
        {
            formatter.parse(personDateOfBirth);
            System.out.println("Valid date!");
            return true;
        }
        catch (Exception e)
        {
            System.out.println("Invalid date!");
            return false;
        }
    }
}
