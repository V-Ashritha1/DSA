import java.util.*;

public class _5Armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int count = 0;
        while(n>0){
            n/=10;
            count++;
        }

        int x = n;
        int ans = 0;
        while(n>0){
            int y = n%10;
            ans += Math.pow(y,count);
            n/=10;
        }
        if(x==ans){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not");
        }
    }
}