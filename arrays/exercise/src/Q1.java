import java.util.*;

public class Q1 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String args[])
    {
        int a,i,j,r,c;

        System.out.println("Enter the number of rows : ");
        r = scan.nextInt();
        System.out.println("Enter the number of columns : ");
        c = scan.nextInt();

        int x[][]= new int[r][c];

        for ( i = 0; i < r; i++)
        {
            for ( j = 0; j < c; j++)
            {
                System.out.println("Enter a 2 digit number : ");
                a = scan.nextInt();

                for(; ;)
                {
                    if (a >= 10 && a <= 99)
                    {
                        x[i][j] = a;
                        break;
                    }
                    else
                    {
                        System.out.println(" Number is not 2-digits. Enter the number again : ");
                        a = scan.nextInt();
                    }
                }

            }

        }

        System.out.println("Entered array : ");
        for (i=0;i<r;i++)
        {
                System.out.println(Arrays.toString(x[i]));
        }
        System.out.println("Array after multiplying each odd element by 2 : ");
        for (i=0;i<r;i++)
        {
            for (j=0;j<r;j++)
            {
                if(x[i][j]%2 ==0 )
                    continue;
                else
                    x[i][j]*=2;
            }
        }
        for (i=0;i<r;i++)
        {
            System.out.println(Arrays.toString(x[i]));
        }

    }
}