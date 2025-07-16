import java.util.Scanner;

public class ReverseNumber {
    private static int reversenumber(int n,int result){
        if(n==0)return result;
        result=result*10+n%10;
        return reversenumber(n/10,result);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value of N:");
        int n=sc.nextInt();
        int result=reversenumber( n,0);
        System.out.println("The Reversed Number is:"+result);
    }
}
