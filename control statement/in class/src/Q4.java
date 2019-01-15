import java.util.*;
public class Q4 
{
    public static void main(String[] args)
    {

        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number with five digits: ");	// prompt
        int num;
        num = number.nextInt();
        
          if (num < 10000 || num > 99999) 
          {
                System.out.println("The entered number is not a 5 digit number. Re-enter the number : ");
          //      num = number.nextInt();
          } 


        else 
        {

                int a,b,c,d,e;

               a= (num/10000);
               b=((num/1000)%10);
               c=((num / 100) % 10);
               d=((num % 100) / 10);
               e=((num % 10));
               
      System.out.println(" "+a);
        System.out.println(" "+b);
        System.out.println(" "+c);
        System.out.println(" "+d);
       System.out.println(" "+e);
     }
     }

}