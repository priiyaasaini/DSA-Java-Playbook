class Solution{
    public int getDivisor(int n){
        int count=0;
     for (int i = 1; i*i<=n; i++) {
        if(n%i==0){
            count++;
        }
        if(i!=n/i){
            count++;
        }
     }
     return (count);
    }
}



public class primeNum {
    public static void main(String[] args) {
        // object of solution class
        Solution sol=new Solution();
        int N=3;
        int result=sol.getDivisor(N);
        if(result>2){
            System.out.println("Not prime");
        }
        else{
            System.out.println("Prime number");
        }
       }
    }

