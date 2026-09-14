package week4;

class BankAccount5 {
    private double balance=0;
    public void deposit(double x) {
        if(x > 0) {
            balance += x;
        }
    }
}