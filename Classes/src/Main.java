public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();

        porsche.setModel("Carrera");
        System.out.println("Model is now: " + porsche.getModel());

        Account mattsAccount = new Account("12345", 100.00, "Matt", "matt@email.com", "91234567890");
        mattsAccount.deposit(20.00);
        mattsAccount.withdraw(50.00);
    }
}
