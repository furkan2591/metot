package metot;

import org.w3c.dom.ls.LSOutput;

public class ilkFonksiyon {

    static void helloWorld() {
        System.out.println("hello");
    }

    static void sum (int a, int b) {
        System.out.println(a+b);
    }

    static int sup (int base, int exp){
        int result=1;
        for (int i=1; i<=exp; i++) {
            result*=base;
        }
        System.out.println(result);  // her çarpma işleminin sonucunu fonsiyon içine de yazdırabiliyoruz.
        return result;



    }
    public static void main(String[] args) {
        helloWorld();  //1. void çağırma

        sum(5,6); //2. void çağırma

        int sonuc = sup(3,2);  // return çağırma seçeneği
        System.out.println(sonuc);

        System.out.println(sup(2,4));  // return farklı çağırma seçeneği


    }
}
