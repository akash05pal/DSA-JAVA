import java.util.Scanner;


public class recursion1 {
    static void f(int i,int n){
        if(i>n){
            return ;
        }
        System.out.println("akash");
        f(i+1,n);
    }
    
    public static void main(String[] args) {
        
    
   Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    f(1,n);
    }
}
