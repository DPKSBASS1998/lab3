public class Fibonacci {
    public static int cycleExecute(int N) {
        if (N <= 1) {
            return N;
        }
        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= N; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static int recursionExecute(int N) {
        if (N <= 1) {
            return N;
        }
        return recursionExecute(N - 1) + recursionExecute(N - 2);
    }
}
