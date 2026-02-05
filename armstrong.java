// armstrong number is the number where sum of the cubes if each digit is eual to the number

public class armstrong {
    public static void main(String[] args) {
        int x=153;
        System.out.println(armCheck(x));
    }
    // method/function of armstrong check
    public static boolean armCheck(int n){
        int onlyDigit=0;
        int reverseNum=0;
        int original = n;
        while(n!=0){
            onlyDigit=n%10;
            reverseNum=reverseNum+onlyDigit*onlyDigit*onlyDigit;
            n=n/10;
        }
        return original==reverseNum;

    }
}
