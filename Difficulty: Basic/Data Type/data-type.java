//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            int ans = obj.dataTypeSize(s);
            String Character = "Character";
            if (Character.equals(s) && ans == 2) {
                ans = 1;
            }
            System.out.println(ans);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static int dataTypeSize(String str) {
        
        switch (str) {
            case "Integer": return 4;
            case "Character": return 2;
            case "Long": return 8;
            case "Float": return 4;
            case "Double": return 8;
            default: return -1; 
        }
    }

    public static void main(String[] args) {
        System.out.println(dataTypeSize("Integer"));  
        System.out.println(dataTypeSize("Character")); 
        System.out.println(dataTypeSize("Long"));
        System.out.println(dataTypeSize("Float")); 
        System.out.println(dataTypeSize("Double"));
    }
}
