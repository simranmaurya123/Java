import java.lang.*;
import java.util.Scanner;

class Calculation_of_area_of_triangle{

    public static void main(String[] args) {
        Scanner base= new Scanner(System.in);
        System.out.println("Enter base: ");
        float input = base.nextFloat();

        Scanner height = new Scanner(System.in);
        System.out.println("Enter a height : ");
        float inp = height.nextFloat();

        


        System.out.println("Area of Triangle is: " + input*inp/2);



         
    }
}