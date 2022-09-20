public class Main {
    public static void main(String[] args) {
        //For döngüsü
        for (int i = 0; i<10; i++){
            System.out.println(i);
        }
        System.out.println("for döngüsü  bitti");

        //While döngüsü
        int i = 1;
        while(i<10){
            System.out.println(i);
            i = i+2;
        }
        System.out.println("while döngüsü bitti");

        //do-while loop
        int j = 1;

        do{
            System.out.println(j);
            j+=2;
        }while (j<10);
        System.out.println("do while döngüsü bitti.");
    }
}
