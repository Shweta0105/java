import java.util.*;

public class TestCylinder {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter the radius : ");
        double radius = scan.nextDouble();
        System.out.println(" Enter the height : ");
        double height = scan.nextDouble();

        Cylinder obj = new Cylinder();

        obj.setRadius(radius);
        obj.setHeight(height);

        System.out.println(" Radius : "+obj.getRadius());
        System.out.println(" Height : "+obj.getHeight());
        System.out.println(" Base Area : "+obj.getArea());
        System.out.println(" Volume : "+obj.getVolume());

    }

}