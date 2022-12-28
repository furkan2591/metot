package metot;
    import java.util.Scanner;
public class HesapMakinesi {

    static void sum(int a, int b) {
        System.out.println("sonuç: "+ (a+b));
    }
    static void exponent(int a, int b) {
        int carp=1;
        for(int i=0; i<b;i++) {
            carp*=a;
        }
        System.out.println("sonuç: "+ carp);
    }

    static int divided(int a,int b){
        if(b==0) {
            System.out.println("b değeri sıfı olamaz");
            return 9;                  /* BURASI ÇOK ÖNEMLİ!!! sout içerisine yalnızca verilecek mesajı yazdım.
                                           Dolayısıyla, altındaki return 9; değerine bakmadan yalnızca mesajı yazdırdı */
        }
        System.out.println("bölme işlemi sonucu:"+(a/b));
        return a/b;
    }


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int select;
        String menu = "1-toplama\n"
                    +"2-çıkarma\n"
                    +"3-çarpma\n"
                    +"4-üslü sayı\n"
                    +"5-Mod\n"
                    +"6-Bölme\n"
                    +"7-Dikdörtgen Alan\n"
                    +"8-Çıkış yap";

        System.out.println(menu);


            while(true) {               //true vediğimiz için bu döngü her zaman başlayacak.
                System.out.print("İşlem Seçiniz: ");
                select = inp.nextInt();
                if(select==8)
                    break;

                System.out.print("ilk sayı: ");
                int a = inp.nextInt();
                System.out.print("ikinci sayı: ");
                int b = inp.nextInt();

                switch (select) {
                    case 1:
                        sum(a, b);
                        break;
                    case 4:
                        exponent(a,b);
                        break;
                    case 6:
                       divided(a,b);
                        break;
                    default:
                        System.out.println("geçersiz işlem seçtiniz");
                        break;
                }
            }

        System.out.println("güle güle");   //select 8 dediğimiz için döngüden çıktı, buraya geldi.

    }
}
