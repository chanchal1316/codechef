/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class AGELIMIT
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i = 1; i <= T; i++) {
		    byte X = sc.nextByte();
		    byte Y = sc.nextByte();
		    byte A = sc.nextByte();
		    
		    if(X >= 20 && X < Y && Y <= 40) {
		        if(A >= 10 && A<= 50) {
		            if(A >= X && A < Y)
		        System.out.println("YES");
		        else
		        System.out.println("NO");
		        }
		    }
		}
        sc.close();
		    
	}
}

