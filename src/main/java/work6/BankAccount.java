package work6;

public class BankAccount {
   public double balance;

    public void checkBalance() {
        if (balance < 100) {
            System.out.println("დაბალი ბალანსი");
        } else {
            System.out.println("ბალანსი: " + balance);
        }
    }
}
