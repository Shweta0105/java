import java.util.*;

public class Distance
{
    Scanner scan = new Scanner(System.in);

    float f1, f2, i1, i2;
    float distance;
    float feet, inch;

    Distance()
    {
        System.out.println(" Non Parameterized Constructor ");
    }

    Distance(float f1, float f2, float i1, float i2 )
    {
        this.f1=f1;
        this.f2=f2;
        this.i1 = i1;
        this.i2=i2;
    }

    public float getFeet()
    {
        System.out.println(" Enter feet 1 : ");
        f1 = scan.nextFloat();
        return f1;
    }

    public float getFeet1()
    {
        System.out.println(" Enter feet 2 : ");
        f2 = scan.nextFloat();
        return f2;
    }

    public float getInch()
    {
        System.out.println(" Enter inch 1 : ");
        i1 = scan.nextFloat();
        return i1;
    }

    public float getInch1()
    {
        System.out.println(" Enter inch 2 : ");
        i2 = scan.nextFloat();
        return i2;
    }

    public void setfeet(float f1, float i1)
    {
        this.f1 = f1;
        this.i1 = i1;
    }

    public float setfeet(float f1, float f2, float i1, float i2)
    {
        this.f1 = f1;
        this.f2 = f2;
        this.i1 = i1;
        this.i2 = i2;
        return f1;
    }

    public void sum(Distance d)
    {
        feet = getFeet() + d.getFeet1();
        inch = getInch() + d.getInch1();

        System.out.println(" Sum is : "+ feet + " " + inch);
    }
}