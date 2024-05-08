import java.util.*;

public class lengthOfLongestSubstringWithDistinctCharacters {
    public static int lengthOfLongestSubstring(String S) {
        int n = S.length();
        if (n == 0) return 0;

        int maxLen = 1;
        for (int i=0; i < n-1; i++) {
            boolean[] visited = new boolean[128];
            visited[S.charAt(i)] = true;
            for (int j = i+1; j < n; j++) {
                if (visited[S.charAt(j)]) {
                    break;
                }
                visited[S.charAt(j)] = true;
                maxLen = Math.max(maxLen, j-i+1);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println(lengthOfLongestSubstring(S));
    }
}