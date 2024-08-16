public class challengee{
    public static void main(String[] args) {
        
        String str ="programmer@gmail.com";
        String str1 ="ankit.sharma@gmail.com";
        String str2="sneha.verma@yahoo.com";
        String str3 ="rhaul.patel@hotmail.com";
        String str4 = "ritu.agarwal@gmail.com";

        
        
        String username=str.substring(0,10);
        String username2=str1.substring(0,12);
        String username3=str2.substring(0,11);
        String username4=str3.substring(0,11);
        String username5=str4.substring(0,12);
        
        String domain=str.substring(11,20);
        String domain1=str1.substring(13,22);
        String domain2=str2.substring(12);
        String domain3=str3.substring(12);
        String domain4=str4.substring(13);


        int i= str.indexOf("@");

        System.out.println("usename: "+username+"\n"+username2+"\n"+username3+"\n"
        +"\n"+username4+"\n"+username5);
        System.out.println("domain: "+domain+"\n"+domain1+"\n"+domain2
        +"\n"+domain3+"\n"+domain4);
        System.out.println("index of @ : "+i);

        System.out.println(domain.startsWith("gmail"));
        System.out.println(domain1.startsWith("gmail"));
        System.out.println(domain2.startsWith("gmail"));
        System.out.println(domain3.startsWith("gmail"));
        System.out.println(domain4.startsWith("gmail"));



        int j= domain1.indexOf(".");
        System.out.println(j);
        String name = domain1.substring(0,j);
        System.out.println(name);
        System.out.println(name.equals("gmail"));

    }
}