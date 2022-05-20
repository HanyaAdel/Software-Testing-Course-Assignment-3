public class ATMMachine {
    int balance;

    public ATMMachine(int balance) {
        this.balance = balance;

    }
    public boolean canWithdraw(int withdrawAmount){
        return withdrawAmount < this.balance;
    }
    public boolean withdrawMoney(int withdrawAmount){
        if (canWithdraw(withdrawAmount)) {
            balance = balance - withdrawAmount;
            return true;
        }
        else {
            return false;
        }
    }
    public void depositMoney(int depositAmount){
        this.balance = this.balance + depositAmount;
    }
    public int getBalance(){
        return this.balance;
    }
}
