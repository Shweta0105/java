import java.util.Scanner;

public class HeartRatesApplication {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First Name: ");
        String firstName = scan.nextLine();
        System.out.println("Enter Last Name: ");
        String lastName = scan.nextLine();
        System.out.println("Enter BirthDate: ");
        int day = scan.nextInt();
        int month = scan.nextInt();
        int year = scan.nextInt();

        HeartRates myHeartRate = new HeartRates(firstName, lastName, month, day, year);
        System.out.println("Name: "+ firstName + lastName);
        System.out.println("Age in years: " + myHeartRate.getAge());
        System.out.println("Maximum Heartrate: "+ myHeartRate.MaximumHeartRate());
        myHeartRate.targetHeartRate();

    }

}