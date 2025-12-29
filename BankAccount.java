class BankAccount {
    private int balance;

    void setBalance(int b) { balance = b; }
    int getBalance() { return balance; }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setBalance(5000);
        System.out.println("Balance: " + acc.getBalance());
    }
}
