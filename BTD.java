import java.util.Scanner;

public class BTD {
    private static void convert(int n){
        if(n==0){
            return;
        }
        convert(n/2);
        System.out.print(n%2);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value n:");
        int n=sc.nextInt();
        convert(n);
        
    }
}
