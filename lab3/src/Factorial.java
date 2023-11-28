public class Factorial {
    public static int cycleExecute(int N) {
        int result = 1;
        for (int i = 1; i <= N; i++) {
            result *= i;
        }
        return result;
    }

    public static int recursionExecute(int N) {
        if (N == 0 || N == 1) {
            return 1;
        }
        return N * recursionExecute(N - 1);
    }
}
