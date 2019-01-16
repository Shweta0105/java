import java.util.Scanner;

public class EmployeeTest
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter total number of users : ");
        int total = scan.nextInt();
        
        Employee e1 = new Employee(total);
        e1.display();

    }
}