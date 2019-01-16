import java.util.Scanner;

class Date
{
    int month, day, year;

    Date()
    {
        month = 7;
        day = 28;
        year = 2000;
    }

    Date(int month, int day, int year)
    {
        this.month=month;
        this.day=day;
        this.year=year;
    }

    void displayDate()
    {
        System.out.println(" The date is : "+ day + "/"+month+"/"+year);
    }
}
public class DateTest {
    static Scanner scan = new Scanner(System.in);

    public static void main(String args[])
    {
        int month, day, year, x1, x2, x3;

        System.out.println(" Enter day : ");
        x1 = scan.nextInt();

        for (;;)
        {
                if (x1 >= 1 && x1 <= 31) {
                    day = x1;
                    break;
                }
                else {
                    System.out.println(" Re-enter day : ");
                    x1 = scan.nextInt();
                }
        }

        System.out.println(" Enter month : ");
        x2 = scan.nextInt();
        for (;;)
        {
                if (x2 >= 1 && x2 <= 12)
                {   month = x2;
                    break;
                }
                else
                {
                    System.out.println(" Re-enter month : ");
                    x2 = scan.nextInt();
                }
        }

        System.out.println(" Enter year : ");
        year = scan.nextInt();

        Date ob1= new Date(month,day,year);
        ob1.displayDate();
    }
}