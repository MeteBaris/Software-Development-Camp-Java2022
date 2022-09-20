public class Main {
    public static void main(String[] args) {
        char grade = 'F';

        switch (grade){
            case 'A' :
                System.out.println("Mükemmel : gectiniz ");
            case 'B' :
                System.out.println("Cok güzel : gectiniz ");
            case 'C' :
                System.out.println("Iyi : gectiniz ");
            case 'D' :
                System.out.println("Fena degil : gectiniz ");
            case 'F' :
                System.out.println("Maalesef kaldiniz.");
                break;
            default:
                System.out.println("Gecersiz not girdiniz.");
        }
    }
}
