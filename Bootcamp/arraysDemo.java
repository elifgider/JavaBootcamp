package Bootcamp;

public class arraysDemo {
    public static void main(String[] args) {
        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Elif";
        ogrenciler[1] = "Esma";
        ogrenciler[2] = "Engin";

        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }
    }
}
