package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int a = 0;
        int b = 1;

        for (int i = 1; i <= lastFibonacci; i++) {
            System.out.println(a);
            int sum = a + b;
            a = b;
            b = sum;
        }
    }

    public static void main(String[] args) {
        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        fibonacciSeries.printFibonacci(10);
    }
}
