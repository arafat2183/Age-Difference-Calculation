import java.util.Scanner;

public class AgeDifferenceCalculation {
    public static void main(String[] args) {
        AgeDifferenceCalculation ageDifferenceCalculation = new AgeDifferenceCalculation();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter person1 name: ");
        String person1 = sc.nextLine();
        System.out.print("Hello " + person1 + "! Enter your date of birth. The Birth year should not less then 1900, future and negative value.\n");

        System.out.print("Enter person1 birth year: ");
        int person1BirthYear = sc.nextInt();
        person1BirthYear = ageDifferenceCalculation.birthYearVerification(person1BirthYear);

        System.out.print("Enter person1 birth month: ");
        int person1BirthMonth = sc.nextInt();
        person1BirthMonth = ageDifferenceCalculation.birthMonthVerification(person1BirthMonth);

        System.out.print("Enter person1 birth day: ");
        int person1BirthDay = sc.nextInt();
        person1BirthDay = ageDifferenceCalculation.birthDayhVerification(person1BirthYear, person1BirthMonth, person1BirthDay);

        System.out.print(person1 + "'s " + "date of birth is: " + person1BirthYear + "年" + person1BirthMonth + "月" + person1BirthDay + "日");
    }

    public int birthYearVerification(int person1BirthYear) {
        while (person1BirthYear < 1900) {
            Scanner sc = new Scanner(System.in);
            person1BirthYear = sc.nextInt();
        }
        return person1BirthYear;
    }

    public int birthMonthVerification(int person1BirthMonth) {
        while (person1BirthMonth <= 0 || person1BirthMonth > 12) {
            Scanner sc = new Scanner(System.in);
            person1BirthMonth = sc.nextInt();
        }
        return person1BirthMonth;
    }

    public int birthDayhVerification(int person1BirthYear, int person1BirthMonth, int person1BirthDay) {
        Scanner sc = new Scanner(System.in);
        if (person1BirthDay <= 0) {
            while (person1BirthDay <= 0) {
                person1BirthDay = sc.nextInt();
            }
        } else {
            if (person1BirthMonth == 2) {
                boolean leap = false;
                // if the year is divided by 4
                if (((person1BirthYear % 4 == 0) && (person1BirthYear % 100!= 0)) || (person1BirthYear % 400 == 0))
                    leap = true;
                else
                    leap = false;;

                if (leap) {
                    while (person1BirthDay > 29) {
                        person1BirthDay = sc.nextInt();
                    };
                } else {
                    while (person1BirthDay > 28) {
                        person1BirthDay = sc.nextInt();
                    }
                }

            }
        }
        return person1BirthDay;
    }
}
