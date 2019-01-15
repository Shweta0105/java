import java.util.*;
class Operations {

    public static void main(String[] args) {
        int n1,n2,diff,multiplication,remainder;
        float divide;
        Scanner  number = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n1= number.nextInt();
        System.out.println("Enter a second number: ");
        n2 = number.nextInt();
        
        int s1;

        s1= n1 + n2;
        diff= n1-n2 ;
        multiplication= n1*n2;
        divide=n1/n2;
        remainder=n1%n2;


     System.out.println("sum is: " + s1);
     System.out.println("difference is: " + diff);
     System.out.println("quotient is: " + divide);
     System.out.println("multiplication is: " + multiplication);
     System.out.println("remainder is: " + remainder);
    }
}