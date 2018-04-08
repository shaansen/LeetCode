import java.util.*;
import java.io.*;

public class troubleSort {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int T = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
    
    for (int i = 1; i <= T; i++) {
      int N = in.nextInt();
      int[] arr = new int[N];
      for(int j = 0;j < N; j++){
          arr[j] = in.nextInt();
      }
      
      troubleSort(arr);
      
      int index = check(arr);
      
      if(index == -1){
        System.out.println("Case #" + i + ": OK");  
      } else {
        System.out.println("Case #" + i + ": " + index);  
      }
    }
  }
  
  public static int check(int[] arr){
       int n = arr.length;
       int i = -1;
        for (i = 0; i < n-1; i++){
               if(arr[i] > arr[i+1]){
                    break; 
               }
           }
        if(i == n-1)
            return -1;
       return i;
    }
  
  public static void troubleSort(int[] arr){
       int n = arr.length;
       boolean done = false;
       
       while(!done){
           done = true;
           for (int i = 0; i < n-2; i++){
               if(arr[i] > arr[i+2]){
                    done = false;
                    int temp = arr[i];
                    arr[i] = arr[i+2];
                    arr[i+2] = temp; 
               }
           }
           
       }
    }
}