public class swapno {
    
    static void swap(int a,int b){

        System.out.println(a);
        System.out.println(b);
        int temp=a;
        a = b;
        b =temp;
         //temp=b;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        int a =9;
        int b=3;
        int[] arr= {1,2,3,4,5};
        swap(a,b);

    }
}
