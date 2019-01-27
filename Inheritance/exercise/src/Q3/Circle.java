public class Circle extends Shape {
    private double radius = 1.0;

    public Circle()
    {
        super();
        radius = 2.0;
    }

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled)
    {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea()
    {
        return 3.14*getRadius()*getRadius();
    }

    public String toString()
    {
        return " The area of circle is : " + getArea();
    }
}