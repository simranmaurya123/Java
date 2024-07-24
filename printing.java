public class printing{
    public static void main(String[] args) {
        int x=10;
        float y=125.65868f;
        char z='A';


        System.out.printf("hello %e \n" ,y);


        float a=0.0012f;
        System.out.printf("New %e \n" ,a);
        
        
        String s="java program";
        System.out.printf("hello %s \n" ,s);

        System.out.printf("%1$d %1$d %1$d\n" ,x);

        System.out.printf("%3$s %2$f %1$d\n" ,x,y,s);
  
        System.out.printf("%+5d\n" ,x);

        System.out.printf("%4.3f\n" ,y);
       

        String b="Java";
        System.out.printf("%-20s",b );



        


    }
}