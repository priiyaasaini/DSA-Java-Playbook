    // Count the number of Digits  in a number
    // Time Complexity: O(log₁₀ n), because we divide the number by 10 in each iteration, removing one digit at a time.
    
    public class countDigit {
    public static void main(String[] args) {
        countDigit obj = new countDigit();
        System.out.println(obj.countnum(4567));
    }
    public int countnum(int n) {
        int count = 0;
        if (n == 0) return 1;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}
