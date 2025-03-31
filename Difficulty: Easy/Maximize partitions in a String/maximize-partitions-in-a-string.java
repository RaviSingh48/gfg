//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            int ans = obj.maxPartitions(s);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public int maxPartitions(String s) {
        int n = s.length();
        int[] first = new int[26];
        int[] last = new int[26];
        Arrays.fill(first, -1);

        // Step 1: Find first and last occurrence of each character
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (first[ch - 'a'] == -1) {
                first[ch - 'a'] = i;
            }
            last[ch - 'a'] = i;
        }

        // Step 2: Track partitions
        int end = -1;
        int count = 0;
        for (int i = 0; i < n; i++) {
            end = Math.max(end, last[s.charAt(i) - 'a']);

            // If we reach the end of a partition
            if (i == end) {
                count++;
            }
        }

        return count;
    }
}
