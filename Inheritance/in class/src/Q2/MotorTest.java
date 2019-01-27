import java.util.Scanner;

public class MotorTest {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter the number of tyres : ");
        int n = scan.nextInt();

        switch (n)
        {
            case 2:
                Bike ob1 = new Bike();
                ob1.display();
                break;
            case 4:
                Car ob2 = new Car();
                ob2.display();
                break;
            default:
                Vehicle ob3 = new Vehicle();
                ob3.display();
                break;
        }
    }
}