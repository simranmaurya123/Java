public class stringpractice{
    public static void main(String[] args) {
        String str1="Java Program";
        System.out.println("output from literal pool "+str1);

        String str2=new String("JAVA");
        System.out.println("output from heap"+str2);

        char c[]={'H','e','l','l','o'};
        String  Str3=new String(c);
        System.out.println("output from char"+Str3);

        byte b[]={65,66,67,68};
        String str4=new String(b,2,2);
        System.out.println("output from byte"+str4);

        String str5="Java Program";


        System.out.println("Comparing the two values : " + (str1==str2));
        System.out.println("Comparison between str1 and str5: "+ (str1==str5)) ;







        

    }}
