package metot;

public class palindromSayilar {
    static boolean pal(int n) {
        int temp =n, reverse=0, basamak;
        while(temp!=0) {
            basamak = temp%10;
            reverse= reverse*10 + basamak;
            temp/=10;
        }
        if(reverse==n)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.print(pal(222));

    }
}
