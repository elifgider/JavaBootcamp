package Bootcamp;

public class recapDemo2 {
    public static void main(String[] args) {
        
        double[] mylist={1.2,1.3,1.4,1.5};

        //Arrayi dolaş:
        for (double wander : mylist) {
            System.out.println(wander);
        }
        //Sayıların toplamını ekrana yazdır:
        double total=0;
        for (double d : mylist) {
            total+=d;
        }
        System.out.println("toplam : "+ total);
        //En büyük sayıyı yazdır:
        double enBuyuk=mylist[0];
        for (int i = 0; i < mylist.length; i++) {
            if(mylist[i]>enBuyuk){
                enBuyuk=mylist[i];
            }
        }
        System.out.println("en büyük sayı: "+ enBuyuk);
    }

}
