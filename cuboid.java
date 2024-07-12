import java.lang.*;
import java.util.*;

class cuboid{
    public static void main(String[] args) {
         
        float length,breadth,height,total_area,volume;


        Scanner a= new Scanner(System.in);
        System.out.println("Enter Length");
        length = a.nextFloat();


        Scanner b= new Scanner(System.in);
        System.out.println("Enter Breadth");
        breadth = b.nextFloat();

        Scanner c= new Scanner(System.in);
        System.out.println("Enter Height");
        height = c.nextFloat();



        total_area=2*((length*height)+ (length*breadth) + (height*breadth));

        volume=length*breadth*height;

        System.out.println("Total area of cuboid : " + total_area);

        System.out.println("Total volume of cuboid : " + volume);
        




    }
}