//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GfG {
    

	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t > 0){
	            String S[] = br.readLine().split(" ");
            
            long a = Long.parseLong(S[0]);
            
            long b = Long.parseLong(S[1]);
	       
	    	Solution ob = new Solution();
           
            System.out.println(ob.divide(a,b));
            t--;
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static long divide(long a, long b)
    {
        //code here
        long sign = ((a>0)^(b>0))? -1: 1;
        if(b==-1){
                return -a;
            }
        a = Math.abs(a);
        b = Math.abs(b);
       // System.out.print(b);
        long q = 0 , temp = 0;
            
    //     if(b==1){
    //             return a;
    //         }
            
    //     while(a>b){
            
    //         a-=b; //18=18-6 =?12 , q=1 ; 12= 12-6 6,q=2; 6
    //         ++q;
    //     }
    //     if(a==b){
    //     // if(q==0)
    //     //     return 1;
            
    //     if(sign==-1){
    //         q = -(q+1);
    //         return q;}
    //     return q+1;
    //              }
    //         // if(a==b){
    //         // if(q==0)
    //         //     return 1;
    //         //     if(sign==-1){
    //         //         q = -(q+1);
    //         //         return q;
    //         //     }
    //         //return q+1;
    //   // }
     for (int i = 31; i >= 0; --i)
{
 
    if (temp + (b << i) <= a)
    {
        temp += b << i;
        q |= 1L << i;
    }
}
        if(sign==-1){
            q = -q;
            return q;
        }
        return q;
        
    }
        
    }
