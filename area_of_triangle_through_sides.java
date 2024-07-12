import java.lang.*;
import java.util.*;

class area_of_triangle_through_sides{
    public static void main(String[] args) {
        int input,inp,inp3;
        float S;
        double area;

        Scanner side1 = new Scanner(System.in);
        System.out.println("Enter Side1: ");
        input= side1.nextInt();

        Scanner side2 =new Scanner(System.in);
        System.out.println("Enter Side2: ");
        inp= side2.nextInt();

        Scanner side3=new Scanner(System.in);
        System.out.println("Enter side3: ");
        inp3= side3.nextInt();

        S= (input+inp+inp3)/2f;
        area= Math.sqrt(S*(S-input)*(S-inp)*(S-inp3));
       
       System.out.println("Area of triangle : "+ area);






    }
}