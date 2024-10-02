import java.util.Scanner;

public class reversenum {
    public static void main(String[] args) {
        int num;
        int revnum=0;
        int lastdigit=0;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();

        while (num>0) {
            lastdigit=num%10;
            num=num/10;
            revnum=(revnum*10)+lastdigit;

        }
        System.out.println("revnum");
    }
}
