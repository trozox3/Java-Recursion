import java.util.Scanner;

public class Sumofnaturalno {
    private static int SumofN(int n){
        if(n<=0){
            return 0;
        }
        return n+SumofN(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value N:");
        int n=sc.nextInt();
        int result=SumofN( n);
        System.out.println("The Sum of Natural No "+n+" is:"+result);

    }
    
}