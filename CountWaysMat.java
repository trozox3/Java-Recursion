import java.util.Scanner;

public class CountWaysMat {
    public static int R,C=0;
    private static int tt(int r,int c){
       
        if(r==R-1 || c==C-1){
            return 1;
        }
        return tt(r+1,c)+tt(r,c+1); 


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The R,C Value:");

        R=sc.nextInt();
        C=sc.nextInt();
        int ways=tt(0,0);
        System.out.println("Total No of Ways are:"+ways);
    }
}
