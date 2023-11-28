public class Main {

    public static void main(String[] args) {
        // Завдання 1
        int N1 = 10;
        int resultFactorial = Factorial.cycleExecute(N1);
        int resultFactorialRecursion = Factorial.recursionExecute(N1);
        assert resultFactorial == resultFactorialRecursion : "Different values";
        System.out.println("Factorial of " + N1 + ": " + resultFactorial);

        // Завдання 2
        int N2 = 10;
        int resultFibonacci = Fibonacci.cycleExecute(N2);
        int resultFibonacciRecursion = Fibonacci.recursionExecute(N2);
        assert resultFibonacci == resultFibonacciRecursion : "Different values";
        System.out.println("Fibonacci number at position " + N2 + ": " + resultFibonacci);

        // Завдання 3
        int N3 = 123456789;
        int resultSumOfDigits = SumOfDigits.execute(N3);
        System.out.println("Input value: " + N3);
        System.out.println("Sum of digits: " + resultSumOfDigits);

        // Завдання 4
        int a = 20;
        int b = 23;
        int resultRecursiveSum = RecursiveSum.execute(a, b);

        System.out.println("Input values: a=" + a + ", b=" + b);
        System.out.println("Sum without + operator: " + resultRecursiveSum);
    }
}
