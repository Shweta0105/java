import java.util.*;

public class Q3 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter 1st number : ");
        double n1 = input.nextDouble();
        System.out.print("\n Enter 2nd number : ");
        double n2 = input.nextDouble();
       n1 = n1*1000;
       n2 = n2*1000;
        if(n1==n2)
          System.out.println("The two numbers ARE equal upto 3 places");
        else
       System.out.println("The two numbers ARE NOT equal upto 3 places");
}
}