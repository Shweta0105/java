import java.util.*;
import java.lang.Math;

class Q2
{

public static void main(String args[])
{
   int y,x=0;
   Scanner month= new Scanner(System.in);
   do
 {
 	System.out.println("enter the number from 1 to 12");
   y=month.nextInt();
 
   if((y>=1) && (y<=12))
   {
   switch(y)
   {
   	case 1:
   	System.out.println("It's January");
   	break;
   	case 2:
   	System.out.println("It's February");
   	break;
   	case 3:
   	System.out.println("It's March");
   	break;
   	case 4:
   	System.out.println("It's April");
   	break;
   	case 5:
   	System.out.println("It's May");
   	break;
   	case 6:
   	System.out.println("It's June");
   	break;
   	case 7:
   	System.out.println("It's July");
   	break;
   	case 8:
   	System.out.println("It's August");
   	break;
   	case 9:
   	System.out.println("It's September");
   	break;
   	case 10:
   	System.out.println("It's October");
   	break;
   	case 11:
   	System.out.println("It's November");
   	break;
   	case 12:
   	System.out.println("It's December");
   	break;
   }
}


else{
	System.out.println("The number is incorrect");
}
Scanner enter= new Scanner(System.in);
System.out.println("do you want to continue? 1.Yes 2.No?");
 x=enter.nextInt();

}while(x==1);

}
}