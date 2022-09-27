public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();
        CustomerManager customerManager = new CustomerManager();
        customerManager.add();
        customerManager.list();
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.list();
        employeeManager.add();
        employeeManager.bestEmployee();
    }
}
