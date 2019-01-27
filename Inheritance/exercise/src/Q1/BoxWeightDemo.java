import java.util.Scanner;

public class BoxWeightDemo {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        BoxWeight b1 = new BoxWeight();
        BoxWeight b2 = new BoxWeight(3,4,5,6);
        BoxWeight b3 = new BoxWeight();

        System.out.println(" Enter width : ");
        float width = scan.nextFloat();
        System.out.println(" Enter height : ");
        float height = scan.nextFloat();
        System.out.println(" Enter depth : ");
        float depth = scan.nextFloat();
        System.out.println(" Enter weight : ");
        float weight = scan.nextFloat();

        b3.setDimensions(height,depth,width,weight);
        b3.displayWeight();

        System.out.println(" Enter depth : ");
        depth = scan.nextFloat();
        System.out.println(" Enter height : ");
        height = scan.nextFloat();
        System.out.println(" Enter width : ");
        width = scan.nextFloat();

        b1.setDimensions(height,depth,width);
        b1.displayVolume();
    }
}