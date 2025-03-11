//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        PrintWriter out=new PrintWriter(System.out);
        
        //taking testcases
        int t = Integer.parseInt(br.readLine()); 
    	for(int i=0;i<t;i++)
    	{
            String str=br.readLine();
    		
    		//input n and d
    	    int n=Integer.parseInt(str);
    		Stack<Integer> stack=new Stack<>();
    		String str1=br.readLine();
    		String[] starr1=str1.split(" ");
    		//inserting elements in the array
    		for(int j=0;j<n;j++)
    		{
    		    stack.push(Integer.parseInt(starr1[j]));
    		}
    		//calling reverse() function
            Solution.reverse(stack);
            for(int j:stack){
                out.print(j+" ");
            }
            out.println();
         
out.println("~");
}
         out.close();
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution { 
    static void reverse(Stack<Integer> s) {
        int n = s.size();
        ArrayList<Integer> tempList = new ArrayList<>();

        // Pop all elements and store them in an array list
        for (int i = 0; i < n; i++) {
            tempList.add(s.pop());
        }

        // Push elements back into the stack in reverse order
        for (int i = 0; i < n; i++) {
            s.push(tempList.get(i));
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println("Original Stack: " + s);
        reverse(s);
        System.out.println("Reversed Stack: " + s);
    }
}
