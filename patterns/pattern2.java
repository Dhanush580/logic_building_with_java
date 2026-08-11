import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    //pattern2
	    
	    Scanner ip=new Scanner(System.in);
	    int n=ip.nextInt();
	    for(int i=0; i<n; i++){
	        for(int j=0; j<n; j++){
	            if(i==0 || i==n-1 || j==0 || j==n-1){
	                System.out.print("*");
	            }
	            else{
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
  

      // ip: 5
    
      // output:
    
      // *****
      // *   *
      // *   *
      // *   *
      // *****
    
	}
}
