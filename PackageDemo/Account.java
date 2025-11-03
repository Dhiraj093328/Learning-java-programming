/*Create account class with private data member balance and public getters and setters method for view balance, withdraw balance deposit balance?*/

public class Account {

    private float balance;

    public float viewBalance() {
        return balance;
    }

    public float depositBal(float amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
        return balance;
    }

    public float withdrawBal(float amount) {
        if (balance > amount && amount > 0) {
            balance = balance - amount;
        }
        return balance;
    }
}
