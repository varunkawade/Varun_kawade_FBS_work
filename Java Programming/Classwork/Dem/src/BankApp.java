import java.time.LocalDateTime;
import java.util.Scanner;

/* ================= TRANSACTION ================= */
class Transaction {
    int id;
    String type;
    double amount;
    LocalDateTime dateTime;

    Transaction(int id, String type, double amount) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.dateTime = LocalDateTime.now();
    }
}

/* ================= ACCOUNT ================= */
abstract class Account {
    int accountNo;
    String holderName;
    double balance;
    String status;

    Transaction[] tArr = new Transaction[20];
    int tCount = 0;

    Account(int accNo, String name, double bal) {
        accountNo = accNo;
        holderName = name;
        balance = bal;
        status = "OPEN";
    }

    boolean deposit(double amt) {
        if (status.equals("OPEN") && amt > 0) {
            balance += amt;
            addTxn("DEPOSIT", amt);
            return true;
        }
        return false;
    }

    boolean withdraw(double amt) {
        if (status.equals("OPEN") && balance >= amt) {
            balance -= amt;
            addTxn("WITHDRAW", amt);
            return true;
        }
        return false;
    }

    void closeAccount() {
        status = "CLOSED";
    }

    void addTxn(String type, double amt) {
        tArr[tCount] = new Transaction(tCount + 1, type, amt);
        tCount++;
    }

    double getBalance() {
        return balance;
    }

    abstract double calculateInterest();
}

/* ================= SAVINGS ================= */
class SavingsAccount extends Account {
    static final double MIN_BAL = 5000;
    double rate = 0.04;

    SavingsAccount(int a, String n, double b) {
        super(a, n, b);
    }

    boolean withdraw(double amt) {
        if (status.equals("OPEN") && balance - amt >= MIN_BAL) {
            balance -= amt;
            addTxn("WITHDRAW", amt);
            return true;
        }
        return false;
    }

    double calculateInterest() {
        return balance * rate;
    }
}

/* ================= SALARY ================= */
class SalaryAccount extends Account {
    SalaryAccount(int a, String n, double b) {
        super(a, n, b);
    }

    double calculateInterest() {
        return 0;
    }
}

/* ================= CURRENT ================= */
class CurrentAccount extends Account {
    double overdraft;

    CurrentAccount(int a, String n, double b, double od) {
        super(a, n, b);
        overdraft = od;
    }

    boolean withdraw(double amt) {
        if (status.equals("OPEN") && balance + overdraft >= amt) {
            balance -= amt;
            addTxn("WITHDRAW", amt);
            return true;
        }
        return false;
    }

    double calculateInterest() {
        return 0;
    }
}

/* ================= LOAN ================= */
class LoanAccount extends Account {
    double loan;
    double rate = 10;

    LoanAccount(int a, String n, double loanAmt) {
        super(a, n, 0);
        loan = loanAmt;
    }

    boolean deposit(double amt) {
        loan -= amt;
        addTxn("REPAY", amt);
        return true;
    }

    double calculateInterest() {
        return loan * rate / 100;
    }
}

/* ================= DAO ================= */
class BankDAO {
    Account[] accArr = new Account[50];
    int count = 0;
    double openingCash = 0;

    boolean addAccount(Account acc) {
        if (acc == null) return false;
        accArr[count++] = acc;
        openingCash += acc.balance;
        return true;
    }

    Account findAccount(int accNo) {
        for (int i = 0; i < count; i++)
            if (accArr[i].accountNo == accNo)
                return accArr[i];
        return null;
    }

    int getCount() {
        return count;
    }
}

/* ================= CONTROLLER ================= */
class BankController {
    BankDAO dao = new BankDAO();

    boolean openAccount(int type, int accNo, String name, double bal, double extra) {
        Account acc = null;

        if (type == 1 && bal >= SavingsAccount.MIN_BAL)
            acc = new SavingsAccount(accNo, name, bal);
        else if (type == 2)
            acc = new SalaryAccount(accNo, name, bal);
        else if (type == 3)
            acc = new CurrentAccount(accNo, name, bal, extra);
        else if (type == 4)
            acc = new LoanAccount(accNo, name, extra);

        return dao.addAccount(acc);
    }

    boolean deposit(int accNo, double amt) {
        Account a = dao.findAccount(accNo);
        return a != null && a.deposit(amt);
    }

    boolean withdraw(int accNo, double amt) {
        Account a = dao.findAccount(accNo);
        return a != null && a.withdraw(amt);
    }

    double checkBalance(int accNo) {
        Account a = dao.findAccount(accNo);
        return (a != null) ? a.getBalance() : -1;
    }

    double calculateInterest(int accNo) {
        Account a = dao.findAccount(accNo);
        return (a != null) ? a.calculateInterest() : -1;
    }

    boolean closeAccount(int accNo) {
        Account a = dao.findAccount(accNo);
        if (a != null) {
            a.closeAccount();
            return true;
        }
        return false;
    }

    Account getAccount(int accNo) {
        return dao.findAccount(accNo);
    }

    BankDAO getDAO() {
        return dao;
    }
}

/* ================= VIEW ================= */
class BankView {
    Scanner sc = new Scanner(System.in);
    BankController c = new BankController();

    void start() {
        int ch;
        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Open Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Calculate Interest");
            System.out.println("6. Close Account");
            System.out.println("7. Display All Accounts");
            System.out.println("8. Transaction Details");
            System.out.println("9. End Of Day Report");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            ch = sc.nextInt();

            switch (ch) {
                case 1: open(); break;
                case 2: dep(); break;
                case 3: with(); break;
                case 4: checkBal(); break;
                case 5: interest(); break;
                case 6: closeAcc(); break;
                case 7: displayAll(); break;
                case 8: txnDetails(); break;
                case 9: report(); break;
            }
        } while (ch != 0);
    }

    void open() {
        System.out.print("Type (1-Saving 2-Salary 3-Currrent 4-Loan): ");
        int t = sc.nextInt();
        System.out.print("AccNo: ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String n = sc.nextLine();
        System.out.print("Amount: ");
        double b = sc.nextDouble();

        System.out.println(
            c.openAccount(t, a, n, b, b) ? "Account Opened" : "Failed (Check Min Balance)"
        );
    }

    void dep() {
        System.out.print("AccNo: ");
        int a = sc.nextInt();
        System.out.print("Amount: ");
        double amt = sc.nextDouble();
        System.out.println(c.deposit(a, amt) ? "Deposit OK" : "Failed");
    }

    void with() {
        System.out.print("AccNo: ");
        int a = sc.nextInt();
        System.out.print("Amount: ");
        double amt = sc.nextDouble();
        System.out.println(c.withdraw(a, amt) ? "Withdraw OK" : "Failed");
    }

    void checkBal() {
        System.out.print("AccNo: ");
        int a = sc.nextInt();
        double bal = c.checkBalance(a);
        System.out.println(bal == -1 ? "Account Not Found" : "Balance: " + bal);
    }

    void interest() {
        System.out.print("AccNo: ");
        int a = sc.nextInt();
        double i = c.calculateInterest(a);
        System.out.println(i == -1 ? "Account Not Found" : "Interest: " + i);
    }

    void closeAcc() {
        System.out.print("AccNo: ");
        int a = sc.nextInt();
        System.out.println(c.closeAccount(a) ? "Account Closed" : "Account Not Found");
    }

    void displayAll() {
        BankDAO d = c.getDAO();
        System.out.println("AccNo | Name | Balance | Status");
        for (int i = 0; i < d.getCount(); i++) {
            Account a = d.accArr[i];
            System.out.println(a.accountNo + " | " + a.holderName + " | " + a.balance + " | " + a.status);
        }
    }

    void txnDetails() {
        System.out.print("AccNo: ");
        int a = sc.nextInt();
        Account acc = c.getAccount(a);
        if (acc == null) {
            System.out.println("Account Not Found");
            return;
        }
        System.out.println("ID | TYPE | AMOUNT | DATE");
        for (int i = 0; i < acc.tCount; i++) {
            Transaction t = acc.tArr[i];
            System.out.println(t.id + " | " + t.type + " | " + t.amount + " | " + t.dateTime);
        }
    }

    void report() {
        BankDAO d = c.getDAO();
        int sav = 0, sal = 0, cur = 0, loan = 0;
        double closing = 0;

        for (int i = 0; i < d.getCount(); i++) {
            Account a = d.accArr[i];
            closing += a.balance;
            if (a instanceof SavingsAccount) sav++;
            if (a instanceof SalaryAccount) sal++;
            if (a instanceof CurrentAccount) cur++;
            if (a instanceof LoanAccount) loan++;
        }

        System.out.println("\n--- END OF DAY REPORT ---");
        System.out.println("Savings Accounts: " + sav);
        System.out.println("Salary Accounts: " + sal);
        System.out.println("Current Accounts: " + cur);
        System.out.println("Loan Accounts: " + loan);
        System.out.println("Opening Cash: " + d.openingCash);
        System.out.println("Closing Cash: " + closing);
    }
}

/* ================= MAIN ================= */
public class BankApp {
    public static void main(String[] args) {
        new BankView().start();
    }
}
