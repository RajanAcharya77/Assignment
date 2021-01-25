import java.util.ArrayList;
import java.util.Random;
public class BankAccount {

    private int accountNumber;
    private String name;
    private double balance;

    private static double interest = 0.3;
    private static ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();

    public BankAccount (String name) {
        this(name,0);
    }


    public BankAccount (String name, double balance) {
        this.setName(name);
        this.balance = balance;
        Random rn = new Random();
        accountNumber = rn.nextInt(899999)+100000;
    }

    public double deposit(double money) {
        if(money< 0){return -1;}
        else{
            balance+=money;
            return money;
        }
    }

    public double withdrawMoney(double money) {
        if(money<0){
            return -1;
        }
        else if (this.balance<money)
        {
            return -1;
        }
        else{
            this.balance-=money;
            return money;
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public static double getInterestRate() {
        int s =accounts.size();
        double rate =interest- s/5 *0.02;
        return rate;
    }

    public double transfer(BankAccount destinationBankAccount, double amount) {
        if(destinationBankAccount == null){return -1;}
        else if(amount >this.balance){return -1;}
        else if(amount<0){return -1;}else
        {
            destinationBankAccount.deposit(amount);
            this.balance -= amount;
            return amount;
        }
    }

    public double transfer(BankAccount[] destinationBankAccount, double amount) {
        if(amount * (destinationBankAccount.length+1) < this.balance){return -1;}
        else if(destinationBankAccount==null){return -1;}
        else if(amount<0){return -1;}
        else if(destinationBankAccount.length==0){return -1;}
        else
            for(int i=0;i<destinationBankAccount.length;i++){
                destinationBankAccount [i].deposit(amount);
                this.balance -= amount;
            }
        return amount*(destinationBankAccount.length+1);
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        String str ="";
        str += "Account Number : "+accountNumber+", Name : "+name+" Balance : "+balance+"\n";
        return str;
    }

    public static void main(String args[]) {
        BankAccount ac = new BankAccount("Rocky", 4100000);
        accounts.add(ac);
        accounts.add(new BankAccount("Bob", 47000));
        accounts.add(new BankAccount("Sandy", 57000));
        accounts.add(new BankAccount("Peter", 870000));
        for(int i=0;i<accounts.size();i++){
            BankAccount a = accounts.get(i);
            System.out.println(a);
        }
        System.out.println("Transfer operation\n");
        ac.transfer(accounts.get(1), 17000);

        for(int i=0;i<accounts.size();i++){
            BankAccount a = accounts.get(i);
            System.out.println(a);
        }
    }

}
