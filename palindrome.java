// palindrome : when reverse is equal to original
// TC = O(log n)
import java.util.Scanner;

public class palindrome {

    // function to check number is palindrome or not
 public static boolean isPalindrome(int x) {
        if(x<0) return false;
        int revNum=0;
        int original=x;
        int lastDigit;
        while(x!=0){
        lastDigit=x%10;
        revNum=revNum*10+lastDigit;
        x=x/10;
    }
            return original==revNum;
        }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
System.out.println("Enter Value");
int x=sc.nextInt();
System.out.println(isPalindrome(x));
    
}
}
