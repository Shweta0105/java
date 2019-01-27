import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter color : ");
        String color = scan.next();
        System.out.println(" Filled : Y or N");
        String choice = scan.next().toLowerCase();

        boolean bool;
        if (choice.charAt(0) == 'y')
            bool = true;
        else
            bool = false;

        System.out.println(" Choose a shape : ");
        System.out.println(" 1. Circle ");
        System.out.println(" 2. Rectangle ");
        System.out.println(" 3. Square ");
        System.out.println(" Enter your choice : ");
        int n = scan.nextInt();

        switch (n)
        {
            case 1 :
                Circle c1 = new Circle();
                System.out.println(" Enter radius : ");
                double radius = scan.nextDouble();
                c1.setRadius(radius);
                System.out.println(c1.toString() + " | Color : " + color + " | Filled : " + bool);
                break;
            case 2:
                Rectangle r1 = new Rectangle();
                System.out.println(" Enter width : ");
                double width = scan.nextDouble();
                System.out.println(" Enter length : ");
                double length = scan.nextDouble();
                r1.setLength(length);
                r1.setWidth(width);
                System.out.println(r1.toString() + " | Color : " + color + " | Filled : " + bool);
                break;
            case 3:
                Square s1 = new Square();
                System.out.println(" Enter side : ");
                double side = scan.nextDouble();
                s1.setSide(side);
                s1.setWidth(side);
                System.out.println(s1.toString() + " | Color : " + color + " | Filled : " + bool);
                break;
        }
    }
}