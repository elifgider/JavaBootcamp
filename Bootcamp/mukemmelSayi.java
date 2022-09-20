package Bootcamp;

public class mukemmelSayi {
    public static void main(String[] args) {
        //bölenlerinin toplamı kendisine eşit olan sayıya mükemmel sayı denir.
        //mükemmel sayı olup olmadığını bul.

        int sayi=6;
        int toplam=0;
        for (int i = 1; i < sayi; i++) {
            if (sayi%i==0){
            toplam+=i; 
            }
        }
    if(toplam==sayi){
        System.out.println("sayı mükemmel sayıdır.");
    }
    else{
        System.out.println("sayı mükemmel değil!");
    }
}
}
