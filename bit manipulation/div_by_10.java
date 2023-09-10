//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.isDivisibleBy10(S));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isDivisibleBy10(String bin) {
    //   int n=Integer.parseInt(bin,2);
     
    //  if (n%10==0)
    //     {
    //       return 1;
    //     }
    //     else
    //     {
    //         return 0;
    //     }
     int remainder = 0;
        
        for (int i = 0; i < bin.length(); i++) {
            char digit = bin.charAt(i);
            int num = Character.getNumericValue(digit);
            remainder = (remainder * 2 + num) % 10;
        }
        if(remainder == 0){
            return 1;
        }
        else return 0;
    }
       
    
}
