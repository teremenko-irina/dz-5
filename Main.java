
public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 2;
        int d = 2;

        int sum1 = a + b;
        int sum2 = c + d;

        System.out.println(String.format("sum1=%d sum2=%d", sum1, sum2));

        boolean isFirstSumGreater = sum1 > sum2;
        System.out.println("First sum greater - " + isFirstSumGreater);

        sum1 += 1;
        sum2 -= 2;

        System.out.println(String.format("sum1=%d sum2=%d", sum1, sum2));

        boolean isNowFirstSumGreater = sum1 > sum2;
        System.out.println("First sum greater - " + isNowFirstSumGreater);
        
        System.out.println(String.format("sum1=%d sum2=%d", sum1, sum2));

        boolean isAnySumEven = sum1 % 2 == 0 || sum2 % 2 == 0;
        System.out.println("Any sum even - " + isAnySumEven);
    }
}