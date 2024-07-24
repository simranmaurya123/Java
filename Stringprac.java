public class Stringprac{
    public static void main(String[] args){
        String str = new String("  Vs Code ");
        
        String Sir= new String("www.udemy.co.in");
        
        int len=str.length();
        System.out.println("length function: "+len);

        String s= str.toUpperCase();
        System.out.println("Upper case function: "+s);

        String s1=str.toLowerCase();
        System.out.println("Lower case function: "+s1);


        String str2= str.trim();
        System.out.println("trim function: "+str2);

        String str3=str.substring(3,6);
        System.out.println("Substring function:  "+str3);

        String str4=str.replace("de", "mn");
        System.out.println("replace function: "+str4);
        

        System.out.println(Sir.startsWith("www"));

        for(int i=0;i<Sir.length();i++)
           
           System.out.println(Sir.charAt(i));



        System.out.println(Sir.indexOf('c'));

        System.out.println(Sir.indexOf("udemy"));

        System.out.println(Sir.indexOf(".",4));



        


            

        
  








        
   
    }

}