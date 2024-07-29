 public class newquestion{
    public static void main(String[] args) {
       
       System.out.println("To check whether the given number is binary or not");
       
        int b=10110001;
        String s=String.valueOf(b);
     
        System.out.println(s.matches("[01]*"));


        System.out.println("To check whether the given number is hexadecimal or not");

        String a= "134bF";
        String c= "5334Z";
        
        System.out.println("first : "+a.matches("[0-9][a-f][A-F]*"));
        System.out.println("second : "+c.matches("[0-9][a-f][A-F]"));
        

        String str1="02/08/2006";

        System.out.println("date:"+ str1.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));


        String str2="a!B%c#D*8%";
        String s1=str2.replaceAll("[!-*]","");

        System.out.println(s1);


        String str3="  abc  df  hj   ij    ikl  mns    ";
        
        String s2= str3.replaceAll("\\s+"," ").trim().toUpperCase();
        String words[]=s2.split("\\s");
        System.out.println("length : "+words.length);

        System.out.println(s2);



        


    }
 }