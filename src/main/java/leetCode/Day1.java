package leetCode;

public class Day1 {
    public static boolean isHappy(int n) {
        int lastdigit =0;
        int sum=0;
        while (n>=1) {
            lastdigit = n%10;
            sum = sum+(lastdigit*lastdigit);
            n=n/10;

            if(n == 0 && sum==1)  {
                return true;
            }
            else if (n == 0) {
                n=sum;
                sum=0;
            }
        }
    return false;
    }

    public static void main(String[] args) {
        System.out.println( Day1.isHappy(2));
    }
}
