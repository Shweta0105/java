import java.util.Scanner;

public class PointTest {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        double x1,x2,y1,y2,d;

        System.out.println(" Enter x1, x2 : ");
        x1 = scan.nextDouble();
        x2 = scan.nextDouble();
        System.out.println(" Enter y1, y2 : ");
        y1 = scan.nextDouble();
        y2 = scan.nextDouble();

        Point p1 = new Point();
        Point p2 = new Point();

        p1.setX1(x1);
        p1.setX2(x2);
        p1.setY1(y1);
        p1.setY2(y2);

        d = p2.Distance(p1);
        System.out.println(" Distance is : "+ d);
    }
}