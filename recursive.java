package metot;

public class recursive {
    static int top(int n) {
        if (n==1) {
            return 1;
        }
        return n + top(n-1);
    }
    public static void main(String[] args) {
        System.out.println(top(6));
    }
}
