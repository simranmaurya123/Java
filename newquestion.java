 public class newquestion{
    public static void main(String[] args) {
        int b=10110001;
        String s=String.valueOf(b);

        System.out.println(s.matches("[01]*"));


        System.out.println("To check whether the given number is hexadecimal or not");

        String a= "134bF";
        String c= "5334Z";
        
        System.out.println("first : "+a.matches("[0-9][a-f][A-F]*"));
        System.out.println("second : "+c.matches("[0-9][a-f][A-F]"));


        


    }
 }