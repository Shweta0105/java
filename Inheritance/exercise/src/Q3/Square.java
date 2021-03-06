public class Square extends Rectangle {
    public Square()
    {
        super();
    }

    public Square(double side)
    {
        super(side,side);
    }

    public Square(double side, String color, boolean filled)
    {
        super(side,side,color,filled);
    }

    public double getSide()
    {
        return getLength();
    }

    public void setSide(double side)
    {
        setLength(side);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    public String toString()
    {
        return "The area of Square is : " + getArea();
    }
}