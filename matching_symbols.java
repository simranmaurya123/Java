public class matching_symbols{
    public static void main(String[]args){

        String str1 = "@";
        System.out.println(str1.matches("."));

        String str2 = "p";
        System.out.println(str2.matches("[abc]"));

        String str3 ="Z";
        System.out.println(str3.matches("[a-zA-Z0-9]"));

        String str4 ="Sa8&";
        System.out.println(str4.matches("[a-z][A-Z][0-8][!-*]"));

        String str5="aB2";
        System.out.println(str5.matches("[a|b][A|B][1|2]"));

        System.out.println("Quantifiers");
        
        String str6="abcdef";
        System.out.println(str6.matches("[a-z]*"));

        String str7="abbbb";
        System.out.println(str7.matches("[abc]{3,7}"));

        String str8="simranmaurya@gmail.com";
        System.out.println(str8.matches("\\w*[@gmail](.)*"));







    }
}