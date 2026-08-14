import java.util.*;

public class _1CountDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n==0){
            System.out.println("0");
        }

        int count = 0;
        while(n>0){
            n/=10;
            count++;
        }
        System.out.println(count);
    }
}