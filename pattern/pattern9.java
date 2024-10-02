public class pattern9 {
    public static void main(String[] args) {
        for(int i=0;i<=9;i++){
            int stars=i;
        if(i>5){
             stars = 2*5-i;
        }       
        for(int j=1;j<=stars;j++){
            System.out.print("*");
        }
        System.out.println("");
     }
    }
}
