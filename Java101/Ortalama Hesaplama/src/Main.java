

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;
        double ort;
        boolean gectiMi;
        String sonuc;
                
        Scanner sc = new Scanner(System.in);

        System.out.print("Matemaik Notu : ");
        mat = sc.nextInt();

        System.out.print("Fizik Notu : ");
        fizik = sc.nextInt();

        System.out.print("Kimya Notu : ");
        kimya = sc.nextInt();

        System.out.print("Turkce Notu : ");
        turkce = sc.nextInt();

        System.out.print("Tarih Notu : ");
        tarih = sc.nextInt();

        System.out.print("Muzik Notu : ");
        muzik = sc.nextInt();

        ort = (mat + fizik + kimya + turkce + tarih + muzik) / 6;

        gectiMi = ort >= 60;
        sonuc = gectiMi ? "Sinifi Gecti" : "Sinifta Kaldi";
        System.out.println("Sinifi Gecme Durumu = " + sonuc);

    }

}
