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
        int reverseNo = 0;

        while (x != 0) {
            int lastDigit = x % 10;
            x = x / 10;

            // overflow check BEFORE updating reverseNo
            if (reverseNo > Integer.MAX_VALUE / 10 ||
               (reverseNo == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
                return 0;
            }
            if (reverseNo < Integer.MIN_VALUE / 10 ||
               (reverseNo == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
                return 0;
            }

            reverseNo = reverseNo * 10 + lastDigit;
        }

        return reverseNo;
    }

}