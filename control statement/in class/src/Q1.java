 import java.util.Scanner;
import java.lang.Math;

class Q1 {

    public static void main(String[] args) {
      int a, b, c;
        double root1, root2, d;
        Scanner s = new Scanner(System.in);
        System.out.println("enter a,b,c values of quadratic equation ax^2+bx+c");
        System.out.print("Enter a:");
        a = s.nextInt();
        System.out.print("Enter b:");
        b = s.nextInt();
        System.out.print("Enter c:");
        c = s.nextInt();
        System.out.println("quadratic equation is:"+a+"x^2 + "+b+"x + "+c);
        d = b * b - 4 * a * c;
        if(d > 0)
        {
            System.out.println("roots are real and uneual");
            root1= (-b+(Math.sqrt(d)))/(2*a);
            root2= (-b-(Math.sqrt(d)))/(2*a);
            System.out.println("roo1 is"+root1);
            System.out.println("roo2 is"+root2);
      }
      if(d == 0)
      {
        root1= (-b+(Math.sqrt(d)))/(2*a);
        System.out.println("roo1 is"+root1);
            System.out.println("roo2 is"+root1);

      }

      if(d<0)
{
    System.out.println("roo1 donot exist");
}


    }
}