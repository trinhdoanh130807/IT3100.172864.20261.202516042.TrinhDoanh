import java.util.*;

public class Leettem {
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(sol.isPalindrome(x));
        sc.close();
    }
}
class Solution {
    public boolean isPalindrome(int x){
        if(x < 0){
            return false;
        }
        int res = x;
        long tem = 0;
        while ( x != 0 ){
            int r = x%10;
            tem = tem*10 + r;
            x/=10;
        }
        if(tem == res){
            return true;
        }
        return false;
    }
}
