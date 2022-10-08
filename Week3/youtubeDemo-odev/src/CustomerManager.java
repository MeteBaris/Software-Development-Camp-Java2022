public class CustomerManager {
    private Customer customer;
    private ICreditManager creditManager;
    public CustomerManager(Customer customer,ICreditManager creditManager){
        this.customer = customer;
        this.creditManager = creditManager;
    }
    public void save(){
        System.out.println("Müsteri kaydedildi. " );
    }
    public void delete(){
        System.out.println("Müsteri silindi. " );
    }
    public void giveCredit(){
        creditManager.calculate();
        System.out.println("Kredi verildi. ");
    }
}
