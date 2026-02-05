// reverse a number
// TC : O(log base 10 n)
import java.util.Scanner;

public class revNum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you number");
        int x=sc.nextInt();
        System.out.println("reverse number : " + reverse(x));
    }

    // function/method for reverse Number
    public static int reverse(int x) {
   int reverseNo=0;
    int lastDigit;

    while(x!=0){
        lastDigit=x%10;
        reverseNo=reverseNo*10+lastDigit;
        x=x/10;
    }
    return reverseNo;
    }
}