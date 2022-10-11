public class TeacherCreditManager extends BaseCreditManager implements ICreditManager{
    @Override
    public void calculate() {
        System.out.println("Ögretmen kredisi hesaplandi ");
    }

    @Override
    public void save() {
        System.out.println("kaydedildi");
    }
}
