class Solution {

    static List<Integer> FirstNegativeInteger(int arr[], int k) {
         // write code here
         List<Integer> listOfNegatives=new ArrayList<>();
         int i=0,j=0,limit=arr.length-k+1;
         while( i<limit){
             if(arr[j]<0 && i<=j){
                 listOfNegatives.add(arr[j]);
                 i++;
             }
             else {
                 if(j-i+1==k){
                     listOfNegatives.add(0);i++;
                 }
                 j++;
             }
         }
         return listOfNegatives;
     }
 
 }
 