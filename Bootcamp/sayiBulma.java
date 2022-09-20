
package Bootcamp;

public class sayiBulma {
    public static void main(String[] args) {
        
        //aranan sayı dizide var mı kontrolü yap!
        int[] sayilar=new int[]{1,2,5,7,9,0};
        int aranacak=12;
        for (int i : sayilar) {
            if(aranacak==i){
                System.out.println("var");
                return;
            }
        }
        System.out.println("yok");
    }
}
