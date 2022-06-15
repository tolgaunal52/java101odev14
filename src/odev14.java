import java.util.Scanner;

public class odev14 {
    public static void main(String[] args) {
        double a = 0.10, nfiyat, ifiyat, x = 1, yonin = 0, b, c, yon, km, yas;

        Scanner input = new Scanner(System.in);

        System.out.println("Hayali Hava Yoluna Hos Geldiniz. \nSizi Hayallerinize Kavusturuyoruz.");
        System.out.println("Bilet Fiyatlari icin Lutfen istenilen bilgileri Giriniz\n");


        System.out.print("Lutfen Mesafeyi Giriniz \"km\" : ");
        km = input.nextDouble();
        if (km > 0) {
        } else {
            System.out.print("Lutfen Mesafeyi Pozitif Bir Deger Giriniz ");
            return;
        }
        System.out.println("Lutfen Gideceginiz Istikameti Belirtin. \nTek Yon Icin - 1\nGidis Donus Icin - 2");
        System.out.print("\nYonunuz ? : ");
        yon = input.nextDouble();
        if (yon == 1 || yon == 2) {
            if (yon == 2) {
                yonin = 0.20;
            }
        } else {
            System.out.print("Lutfen Gecerli Bir Deger Giriniz ");
            return;
        }
        System.out.print("\nLutfen Yasinizi Giriniz : ");
        yas = input.nextDouble();
        if (yas > 0) {
            if (yas > 0 && yas <= 12) {
                x = 0.5;
            } else if (yas > 12 && yas <= 24) {
                x = 0.1;
            } else {
                x = 0.3;
            }
        } else {
            System.out.print("Lutfen Yasinizi Pozitif Bir Deger Giriniz ");
        }


        nfiyat = km * a; //yol ücreti
        b = nfiyat * yonin; //yön indirimi
        c = nfiyat * x; //yaş indirimi
        ifiyat = nfiyat - b - c; //İndirimli Bilet Fiyatı

        System.out.println("\nNormal Bilet Fiyatiniz : " +nfiyat );
        if (yon==1){
            System.out.println("\nYon Indirimi : "+"Biletiniz Tek Yon Oldugu Icin Herhangibir Indiriminiz Yok !!!");
        }
        System.out.println("\nYon Indirimi : " + b);
        System.out.println("Yas Indiriminiz : " +c);
        System.out.println("\nIndirimli Bilet Fiyatiniz : " + ifiyat);
        System.out.println("\nBizi Tercih Ettiginiz Icin Tesekkurler...\nInsallah Hayallerinize Kavusursunuz...");

    }
}