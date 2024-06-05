package leetCode;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=5;
        int temp=0;
        for (int x=0; x<n; x++) {
            temp = a+b;
            a=b;
            b=temp;
        }
        System.out.println(temp);
    }
}
