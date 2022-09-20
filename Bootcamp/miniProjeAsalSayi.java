package Bootcamp;

public class miniProjeAsalSayi {
    public static void main(String[] args) {
        // asal sayı kontrolü yap!

        int sayi = 17;
        if (sayi == 1) {
            System.out.println("sayı asal değil!");
            return;
        }
        if (sayi<1){
            System.out.println("geçersiz sayı!");
        }
        boolean asalMi = true;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asalMi = false;
            }
        }
        if (asalMi == true) {
            System.out.println("sayı asal");
        } else {
            System.out.println("sayı asal değil");
        }
    }
}
