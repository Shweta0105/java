import java.util.*;

public class Q3 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String args[])
    {
        int salesperson, product, i, j;
        double tsales[][] = new double[4][5];
        double tproductsales[] = new double[5];
        double totalsales, value;

        System.out.println(" Enter the salesperson, product and total sales ");

        for(i = 0; i < 4; i++)
        {
            for (j = 0; j < 5; j++)
            {
                System.out.println(" Enter product and value for salesperson " + i + " : ");
                product = scan.nextInt();
                value = scan.nextDouble();
                tsales[i][product] = value;
            }
        }

        System.out.println("** Total sales for each salesperson is displayed at the end of row **");
        System.out.println("** Total sales for each product is displayed at the bottom of column **");
        System.out.printf(" %10d %10d %10d %10d %10d ", 1,2,3,4,5);
        System.out.println(" ");

        for (i=0; i<4; i++)
        {
            totalsales = 0.00;
            System.out.println(" ");
            System.out.println(i);

            for (j=0; j<5; j++)
            {
                totalsales+= tsales[i][j];
                System.out.printf(" %10.2f ", tsales[i][j]);
                tproductsales[j]+= tsales[i][j];
            }

            System.out.printf(" %10.2f \n", totalsales);
        }

        System.out.println(" ");

        for (j=0;j<5;j++)
        {
            System.out.printf(" %10.2f ", tproductsales[j]);
        }



    }
}