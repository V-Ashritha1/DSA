import java.util.*;

public class _6AllDivisors{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        /*ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 1; i<=n; i++){
            if(n%i==0){
                ans.add(i);            
            }
        }

        int[] res = new int[ans.size()];
        for(int i = 0; i<ans.size(); i++){
            res[i] = ans.get(i);
            System.out.println(res[i]);
        }*/

        int ans = 0;
        for(int i = 1; i<=n; i++){
            if(n%i==0){
                ans=i;
                System.out.println(ans);            
            }
        }
    }
}