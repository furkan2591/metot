package metot;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class ilkFonksiyon {

    static void helloWorld() {
        System.out.println("hello");
    }

    static void sum (int a, int b) {
        System.out.println(a+b);
    }

    static int sup (int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }

    static int cikarma(int a, int b) {
        System.out.println("a-b değeri:" +(a-b));
        return a-b;
        }

    static int bolme(int a, int b) {
        if (b==0) {
            System.out.println("b değeri 0 olamaz");
            return 8;
        }
        System.out.println("a/b değeri:" +(a/b));
        return a/b;
        }



    public static void main(String[] args) {
        helloWorld();  //1. void çağırma

        sum(5,6); //2. void çağırma

        int sonuc = sup(3,2);  // return çağırma seçeneği
        System.out.println(sonuc);

        System.out.println(sup(2,4));  // return farklı çağırma seçeneği

        sup (5,2);   // DİKKAATTTT!!!!! BU DEĞERİ çözümledi ama YAZDIRMADI. Çünkü fonksiyon içinde veya burada Sout yapmadık.

        cikarma(5,4);   // return farklı çağırma seçeneği

        bolme(5,0);     // return farklı çağırma seçeneği. SONUCA DİKKAT!!!!

        bolme(5,1);     // return farklı çağırma seçeneği


    }
}
