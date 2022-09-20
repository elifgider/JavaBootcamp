package Bootcamp;

public class loopDemo {
    public static void main(String[] args) {
        //For

        for (int i = 0; i < 10; i+=2) {
            System.out.println(i);
        }
        System.out.println("Döngü bitti!");

        //While
        int i=0;
        while (i<10){
            System.out.println(i); 
          i+=2; 
          
        }
        System.out.println("while döngüsü bitti!");
        //do-while döngüsü
        int j=1;
        do{
            System.out.println(j);
            j+=2;
        }while(j<10);
        System.out.println("do-while döngüsü bitti!");
    }
}
