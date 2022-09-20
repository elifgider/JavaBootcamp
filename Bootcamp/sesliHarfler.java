package Bootcamp;

public class sesliHarfler {
    public static void main(String[] args) {

        char harf = 'a';

        switch (harf) {
            case 'a':
            case 'ı':
            case 'o':
            case 'u':
                System.out.println("kalın");
                break;
            case 'e':
            case 'i':
            case 'ö':
            case 'ü':
                System.out.println("ince");
                default:
                System.out.println("geçersiz harf");
        }

    }
}
