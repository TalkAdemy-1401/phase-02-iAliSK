package model.userinfo;

public class PaymentInfo {
    private int creditBalance;
    private int myCash;

    public PaymentInfo(int creditBalance, int myCash) {
        this.creditBalance = creditBalance;
        this.myCash = myCash;
    }

    public int getCreditBalance() {
        return creditBalance;
    }

    public void setCreditBalance(int creditBalance) {
        this.creditBalance = creditBalance;
    }

    public int getMyCash() {
        return myCash;
    }

    public void setMyCash(int myCash) {
        this.myCash = myCash;
    }
}
