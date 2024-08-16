public class Deleting_array{
    public static void main(String[] args) {
        int n=6;
        int A[]=new int[10];
        A[0]=5;A[1]=9;A[2]=10;A[3]=15;A[4]=18;A[5]=19;
        for(int i=0;i<n;i++){
            System.out.print(A[i]+",");
        }
        System.out.println();

        for(int i=1;i<n;i++){
            A[i]=A[i+1];
        }
        for (int i =0; i <n-1; i++) {
          System.out.print(A[i]+",");  
        }
        System.out.println(" ");
    }

}