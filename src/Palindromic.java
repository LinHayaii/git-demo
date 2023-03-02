import java.util.Scanner;
public class Palindromic {
    public static void main(String[] args){
        int x;
        SolutionForPalin ans = new SolutionForPalin();
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        while (x != 0) {
            System.out.println(ans.isPalindomic(x));
            x = s.nextInt();
        }
    }
}
class SolutionForPalin{
    public boolean isPalindomic(int x){
        //考虑将数字的后一半反转后与原数字比较，若相等，即为回文数
        //负数和个位数是0的肯定不是回文数
        if(x < 0 || x%10==0)
            return false;
        int reverse = 0;
        while(x > reverse){//当反转的数大于原数时，说明已经反转过半，避免记录x的位数
            reverse = reverse*10 + x % 10;
            x /= 10;
        }
        return x == reverse || x == reverse / 10;//当x为偶数位时，相等；当x位奇数位时，反转数比原数多一位，且该位不影响，可直接除去。
    }
}
