import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fiz, kim, tur, muz;
        Scanner sc=new Scanner(System.in);
        System.out.print("Matematik puanınızı giriniz: ");
        mat = sc.nextInt();
        System.out.print("Fizik puanınızı giriniz: ");
        fiz = sc.nextInt();
        System.out.print("Kimya puanınızı giriniz: ");
        kim = sc.nextInt();
        System.out.print("Turkce puanınızı giriniz: ");
        tur = sc.nextInt();
        System.out.print("Müzik puanınızı giriniz: ");
        muz = sc.nextInt();
        double ortalama;
        int toplam = 0;
        int notSayisi = 0;

        if (mat >= 0 && mat <= 100) {
            toplam += mat;
            notSayisi++;
        }

        if (fiz >= 0 && fiz <= 100) {
            toplam += fiz;
            notSayisi++;
        }

        if (kim >= 0 && kim <= 100) {
            toplam += kim;
            notSayisi++;
        }

        if (tur >= 0 && tur <= 100) {
            toplam += tur;
            notSayisi++;
        }

        if (muz >= 0 && muz <= 100) {
            toplam += muz;
            notSayisi++;
        }
        if (notSayisi > 0) {
            ortalama = (double) toplam / notSayisi;

            if (ortalama > 55) {
                System.out.println("Tebrikler..");
            } else {
                System.out.println("Kaldınız..");
            }
            System.out.println("Ortalamanız: " + ortalama);
        } else {
            System.out.println("Geçersiz puan girişi, lütfen 0-100 arasında puan giriniz.");
        }


    }
}
