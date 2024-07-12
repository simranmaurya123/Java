import java.lang.*;
import java.util.*;

class roots_of_quadratic_equa{
    public static void main(String[] args){
      
        System.out.println("In quadratic equation ax^2 + bx +c");
        float a , b, c;
        double r1,r2;
        double determinant;


        Scanner input= new Scanner(System.in);
        System.out.println("Enter a :");
        a = input.nextFloat();

        Scanner inp= new Scanner(System.in);
        System.out.println("Enter b :");
        b = inp.nextFloat();

        Scanner inp3 = new Scanner(System.in);
        System.out.println("Enter c as in constant: ");
        c = inp3.nextFloat();

        determinant=Math.sqrt((b*b) -(4*a*c));

         r1 =(-b + determinant)/(2*a);

         r2 = (-b - determinant)/(2*a);

         
        System.out.println(" Roots of quadratic equation are : "+ "(x + "+r1 +")"+ " and" + " (x + "+r2+")");

    }
}