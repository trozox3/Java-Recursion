import java.util.Scanner;

public class ReverseString {
    private static String reversestring(String str,int in,String result){
        if(str.length()==in)return result;
        result=str.charAt(in)+result;
        return reversestring(str,++in,result);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String n=sc.nextLine();
        String result=reversestring(n,0,"");
        System.out.println("The Reversed String:"+result);
    }
}
