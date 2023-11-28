public class SumOfDigits {
    public static int execute(int N) {
        if (N == 0) {
            return 0;
        }
        return N % 10 + execute(N / 10);
    }
}
