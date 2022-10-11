public class EmailLogger extends BaseLogger{
    private String eMail;
    public void log(String message){
        System.out.println("Logged to Email: " + message);
    }
}
