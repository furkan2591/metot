package metot;

public class recursiveFibonacci {
    static int fib (int n) {
        if (n<=1)
            return n;
        else
            return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        System.out.print(fib(6));

    }
}
