import java.util.*;


public class Point {

    Scanner scan = new Scanner(System.in);
    private double x1,x2,y1,y2;
    private static double distance;

    Point()
    {
        System.out.println(" ");
    }

    Point(double x1, double x2)
    {
        this.x1 = x1;
        this.x2 = x2;
    }
    Point(double x1, double x2, double y1, double y2)
    {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double getX1()
    {
        return x1;
    }

    public double getX2()
    {
        return x2;
    }

    public double getY1()
    {
        return y1;
    }

    public double getY2()
    {
        return y2;
    }

    public void setX1(double x1)
    {
        this.x1 = x1;
    }

    public void setX2(double x2)
    {
        this.x2= x2;
    }

    public void setY1(double y1)
    {
        this.y1=y1;
    }

    public void setY2(double y2)
    {
        this.y2 = y2;
    }

    public double Distance(Point P1)
    {
        distance = Math.pow(Math.pow(getX2()-P1.getX1(),2) + Math.pow(getY2()-P1.getY1(),2), 0.5);
        return distance;
    }
}