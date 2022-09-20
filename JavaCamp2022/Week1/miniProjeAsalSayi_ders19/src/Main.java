public class Main {

    public static void main(String[] args) {
        int number = 23;
        int remainder = number % 2;
        boolean isPrime = true;
        if (number==2){
            System.out.println("Sayi asaldir");
        }
        else if(number<2){
            System.out.println("sayi gecersizdir");
        }
        else{


            for (int i = 2; i<number; i++)
            {
                if (number % i == 0)
                {
                    isPrime = false;
                }
            }

            if (isPrime)
            {
                System.out.println("Sayi asaldir. ");
            }
            else
            {
                System.out.println("Sayi asal degildir");
            }

        }
    }
}
