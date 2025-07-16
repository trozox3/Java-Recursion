import java.util.*;

public class HeadRecursion{
    private static void printN(int n){
        if(n==0){
            return;
    
        }
        printN(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value for N:");
        int n=sc.nextInt();
        printN(n);
        sc.close();

    }
}