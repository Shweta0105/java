import java.util.Scanner;

public class PointTestD {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Point2D ob1 = new Point2D();
        Point3D ob2 = new Point3D();

        System.out.println(" Enter x : ");
        float x = scan.nextFloat();
        System.out.println(" Enter y : ");
        float y = scan.nextFloat();
        ob1.setX(x);
        ob1.setY(y);
        System.out.println(" The x-y coordinate is : " + ob1.toString1());
        System.out.println(" Enter z : ");
        float z = scan.nextFloat();
        ob2.setX(x);
        ob2.setY(y);
        ob2.setZ(z);
        System.out.println(" The x-y-z coordinate is : " + ob2.toString1());


    }
}