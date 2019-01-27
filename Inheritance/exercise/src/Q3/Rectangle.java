public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle()
    {
        super();
        width = 2.0;
        length = 3.0;
    }

    public Rectangle(double width, double length)
    {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double width, double length, String color, boolean filled)
    {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea()
    {
        return getWidth()*getLength();
    }

    public double getPerimeter()
    {
        return 2*(getLength()+getWidth());
    }

    public String toString()
    {
        return "The perimeter is : " +  getPerimeter() + " and the area is : " + getArea();
    }
}