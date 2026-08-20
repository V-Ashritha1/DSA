/* https://leetcode.com/problems/palindrome-number/ */

import java.util.*;

public class _3Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x = n;
        
        int rev = 0;
        while(n>0){
            int last = n%10;
            rev = rev*10 + last;
            n/=10;
        }
        if(x==rev){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}