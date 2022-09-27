public class Main {
    public static void main(String[] args) {
        String message ="Bugun hava cok güzel";
        String newMessage = message.substring(0,2);
        message.substring(0,2);
        System.out.println(newMessage);
        int num = sum(5,7);
        System.out.println(num);
        int total = sum2(2,3,4);
        System.out.println(total);
    }
    public static void add(){

    }
    public static void delete(){

    }
    public static void update(){

    }

    public static int sum(int num1, int num2){
        return num1 +num2;
    }
    //int... anlami int[] gibi
    public static int sum2(int... numbers){
        int sum=0;
        for(int num: numbers){
            sum += num;
        }
        return sum;
    }
    public static String sehirVer(){
        return "Ankara";
    }
}
