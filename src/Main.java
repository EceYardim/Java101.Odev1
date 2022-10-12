
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Değişkenleri oluşturalım
        int matematik, fizik, kimya, turkce, tarih, muzik;

        // Scanner sınıfını tanumlayalım
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan değerleri alalım
        System.out.print("Matematik Notunuz: ");
        matematik = input.nextInt();
        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();
        System.out.print( "Kimya Notunuz: ");
        kimya = input.nextInt();
        System.out.print( "Türkçe Notunuz: ");
        turkce = input.nextInt();
        System.out.print( "Tarih Notunuz: ");
        tarih = input.nextInt();
        System.out.print( "Muzik Notunuz: ");
        muzik = input.nextInt();

        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double ort = toplam / 6.0;
        System.out.println("Ortalamanız:" + ort);
        // Sonucu Karşılaştırma yapalım
        boolean kosul1 = ort > 60;

        //Koşulu ekleyelim
        String str = kosul1?"Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.println(str);







    }
}