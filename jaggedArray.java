import java.io.*;
import java.util.*;

public class jaggedArray {

    /**
     * @param args
     */
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][];
        for (int i = 0; i < n; i++) {
            int r = sc.nextInt();
            arr[i] = new int[r];
            for (int j = 0; j < r; j++)
                arr[i][j] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++)
            System.out.println(Arrays.toString(arr[i]));
        int queries = sc.nextInt();
        int query[][] = new int[queries][2];
        for (int i = 0; i < query.length; i++)
            for (int j = 0; j < query.length; j++)
                query[i][j] = sc.nextInt();
         
        for(int i=0;i<queries;i++){
         try{
            int x=query[i][0];
            int y=query[i][1];
            if (null != arr.get(x).get(y))
             System.out.println(arr.get(x).get(y));
             else
              throw new Exception("Error");
         }catch Exception(e){
    
            System.out.println("Error");
         }
             
         }       
    }
}