/*https://leetcode.com/problems/reverse-integer/description/ */

import java.util.*;

public class _2revDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int rev = 0;
        while(n>0){
            int last = n%10;
            rev = rev*10 + last;
            n/=10;
        }
        System.out.println(rev);
    }
}