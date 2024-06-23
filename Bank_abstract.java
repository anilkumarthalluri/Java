abstract class BankAccount {
    public abstract void deposit(double x, double y);

    public abstract void withdraw(double x, double y);
}

class savingAccount extends BankAccount {
    public void deposit(double damt, double bal) {
        System.out.println("Deposited : " + damt);
        System.out.println("Bank Balance : " + bal);
    }

    public void withdraw(double wamt, double bal) {
        System.out.println("withdraw money : " + wamt);
        System.out.println("Bank Balance : " + bal);
    }
}

class currentAccount extends BankAccount {
    public void deposit(double damt, double bal) {
        System.out.println("Deposited : " + damt);
        System.out.println("Bank Balance : " + bal);
    }

    public void withdraw(double wamt, double bal) {
        System.out.println("withdraw money : " + wamt);
        System.out.println("Bank Balance : " + bal);
    }
}

public class Bank_abstract {
    public static void main(String[] args) {
        savingAccount obj1 = new savingAccount();
        double wamt, damt, bal;
        wamt = 1200;
        damt = 2399;
        bal = 900;
        System.out.println("Savings Account : ");
        System.out.println("--------------------");
        obj1.deposit(damt, bal);
        obj1.withdraw(wamt, bal);
        System.out.println("Current Account : ");
        System.out.println("--------------------");
        currentAccount obj2 = new currentAccount();
        obj2.deposit(damt, bal);
        obj2.withdraw(wamt, bal);
    }
}