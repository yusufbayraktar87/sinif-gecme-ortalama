import java.util.Scanner;

public class sinifgecmeortalama {

    public static void main(String[] args) {

    /* Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
       Geçme Notu : 55
       Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın. */

        int mat, tur, fiz, kim, muz, dersSayisi = 0;
        double ort = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = inp.nextInt();
        if (mat < 0 || mat > 100) {
            System.out.println("Notunuz ortalamaya dahil edilmemistir!");
        } else
            ort += mat;
            dersSayisi++;

        System.out.print("Turkce notunuz : ");
        tur = inp.nextInt();
        if (tur < 0 || tur > 100) {
            System.out.println("Notunuz ortalamaya dahil edilmemistir!");
        } else
            ort += tur;
            dersSayisi++;

        System.out.print("Fizik notunuz : ");
        fiz = inp.nextInt();
        if (fiz < 0 || fiz > 100) {
            System.out.println("Notunuz ortalamaya dahil edilmemistir!");
        } else
            ort += fiz;
            dersSayisi++;

        System.out.print("Kimya notunuz : ");
        kim = inp.nextInt();
        if (kim < 0 || kim > 100) {
            System.out.println("Notunuz ortalamaya dahil edilmemistir!");
        } else
            ort += kim;
            dersSayisi++;

        System.out.print("Muzik notunuz : ");
        muz = inp.nextInt();
        if (muz < 0 || muz > 100) {
            System.out.println("Notunuz ortalamaya dahil edilmemistir!");
        } else
            ort += muz;
            dersSayisi++;

        ort = ort / dersSayisi;
        System.out.println("Ortalamaniz : " + ort);

        if (ort < 55){
            System.out.println("Sinifi gecemediniz...");
        } else
            System.out.println("Tebrikler sinifi gectiniz!");
    }
}