package ex2;

public class Account {
    private String accId;
    private String accHolder;
    private double accBalance;

    public Account(String accId, String accHolder, double accBalance) {
        this.accId = accId;
        this.accHolder = accHolder;
        this.accBalance = accBalance;
    }

    public String getAccId() {
        return accId;
    }

    public String getAccHolder() {
        return accHolder;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    @Override
    public String toString() {
        return "ACC_ID: " + accId + "\nACC_HOLDER: " + accHolder + "\nACC_BALANCE: " + String.format("%.2f", accBalance)
                + "$";
    }
}