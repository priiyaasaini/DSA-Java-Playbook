import java.util.ArrayList;
import java.util.List;

class Solution{
    public List<Integer> getDivisor(int n){
     List<Integer> res=new ArrayList<>();
     for (int i = 1; i*i<=n; i++) {
        if(n%i==0){
            res.add(i);
        }
        if(i!=n/i){
            res.add(n/i);
        }
     }
     return res;
    }
}



public class printallDivisor {
    public static void main(String[] args) {
        List<Integer> result=new ArrayList<>();
        // object of solution class
        Solution sol=new Solution();
        int N=34;
        result=sol.getDivisor(N);
        System.out.println("All divior of " + N + " ");
       for(int value : result){
        System.out.print(value + " ");
       }
    }
}
