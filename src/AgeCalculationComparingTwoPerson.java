import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculationComparingTwoPerson {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Person 1 name: ");
        String personOne = sc.nextLine();

        System.out.println("Hello " + personOne + "! The Birth year should not less then 1900, future and negative value.");
        System.out.println("Enter " + personOne + "'s date of birth in DD-MM-YYYY format: ");
        String personOneDateOfBirth = sc.nextLine();

        AgeCalculationComparingTwoPerson ageCalculationComparingTwoPerson = new AgeCalculationComparingTwoPerson();
        boolean personOneDobCheckResult = ageCalculationComparingTwoPerson.dateValidationCheck(personOneDateOfBirth);

        if (!personOneDobCheckResult) {
            System.out.println(personOneDobCheckResult);
        }else {
            System.out.printf("Enter Person 2 name: ");
            String personTne = sc.nextLine();

            System.out.println("Hello " + personTne + "! The Birth year should not less then 1900, future and negative value.");
            System.out.println("Enter " + personTne + "'s date of birth in DD-MM-YYYY format: ");
            String personTwoDateOfBirth = sc.nextLine();
            boolean personTwoDobCheckResult = ageCalculationComparingTwoPerson.dateValidationCheck(personOneDateOfBirth);

            if (!personTwoDobCheckResult) {
                System.out.println(personTwoDobCheckResult);
            }else {
                System.out.println("working perfectly.");
            }
        }

    }

    public static boolean dateValidationCheck(String personDateOfBirth) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
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

//    public String ageDifference (String personOneDobCheckResult, String personTwoDobCheckResult) {
//
//    }
}
