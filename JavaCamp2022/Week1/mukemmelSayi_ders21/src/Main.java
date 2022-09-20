public class Main {

    public static void main(String[] args) {
	    int num = 5;
        int total = 0;

        for(int i = 1; i< num; i++){
            if (num% i == 0){
                total = total + i;
            }
        }
        if (total == num){
            System.out.println("mükemmel sayidir");
        }
        else{
            System.out.println("Mükemmel sayi degildir ");
        }
    }
}
