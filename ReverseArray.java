import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    private static char[] rev(char arr[],int in){
        int n=arr.length;
        if(in==n/2){
            return arr;

        }
        swap(arr,in,n-in-1);  
        return rev(arr,in+1);
        //{'a','b','c','d'}
        //swap(0,3)={'d','b','c','a'}
        //swap(1,2)={'d','c','b','a'}

    }
    private static char[] swap(char arr[],int in1,int in2){
        char t=arr[in1];
        arr[in1]=arr[in2];
        arr[in2]=t;
        return arr;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value of N:");

        int n=sc.nextInt();
        System.out.println("Enter the Array Value:");
        char[] arr=new char[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next().charAt(0);


        }
        rev(arr,0);
        System.out.println(arr);
    
    }
}
