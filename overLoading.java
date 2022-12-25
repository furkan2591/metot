package metot;

public class overLoading {
    static void func(int a) {
        System.out.println("Parametreli: "+ a);
    }

    static void func(double a) {
        System.out.println("Parametreli: "+ a);
    }
    static int func (int a, int b) {
        return a+b;
    }
    static int func (int a, int b, int c) {
        return a+b+c;
    }
    public static void main(String[] args) {
        func(5);
        func(5.0);

        int sonuc = func(4,9);
        System.out.println("Parametreli1: "+sonuc);

        System.out.println("Parametreli2: "+func(4,3,2));
    }
}
