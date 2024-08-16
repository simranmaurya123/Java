
import java.util.Scanner;

public class Armstrong_number{
    public static void main(String[]args){
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int r;
        int rev=0;
        int m=n;

    while(n>0){
        r=n%10; 
        rev = rev *10+r;
        n=n/10;
    }
    if (rev==m){
        System.out.println("It is a pallindrome");

    }
    else{
        System.out.println("It is not a pallindrome");
    }
            
        


}
}