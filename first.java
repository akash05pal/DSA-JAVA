import java.util.Scanner;

public class first{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] ae=new int[5];
        
        for(int i=0;i<ae.length;i++){
            ae[i]=in.nextInt();    
        }

        for(int i=0;i<ae.length;i++){
            System.out.println(ae[i]+" ");

        }

    }
}