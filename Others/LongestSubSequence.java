package Others;


public class LongestSubSequence {

       public static int[] L = new int[10];
       public static int prevHighest = 0;

       public static int longestSeq(int[] arr, int len) {
              int length = 0;
              L[0] = 1;
              for (int i = 1; i < len; i++) {
                     
                     if(arr[i] > arr[i-1]){
                           L[i] = L[i-1] + 1;
                     }
                     else{
                           //int newLen = 0;
                           for(int j=0 ; j < i ; j++){
                                  if(arr[i] > arr[j])
                                         L[i] = Math.max(L[i], L[j]) + 1;
                                  else
                                         L[i] = Math.max(L[i], L[j]);
                                  
                           }
                     }
                     
                     length=  L[i];
              }      
              return length;
       }      
                     
              

       public static void main(String[] args) {
              // TODO Auto-generated method stub
              int[] arr = { 2, 9, 5, 6, 8, 1 };
              System.out.println(longestSeq(arr, arr.length));

       }

}
