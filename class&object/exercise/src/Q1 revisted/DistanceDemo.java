import java.util.Scanner;

public class DistanceDemo {

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        Distance d1 = new Distance();
        Distance d2 = new Distance();

        d1.setfeet(5,6,7,8);
        d2.setfeet(9,10,11,12);
        d1.sum(d2);

    }
}