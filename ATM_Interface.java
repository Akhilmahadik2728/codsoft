import java.util.*;

   class bankaccount{
    private double balance;
    public bankaccount(double initialbalance) {
        this.balance = initialbalance;
    }
    public double getbalance() {
        return balance;
    }
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Deposit of rs" + amount + "Successful. Current Balance in rs  =" + balance);
        } else{
            System.out.println("Invalid deposit Amount");
        }
    }
    public void Withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Deposit of rs" + amount + "Successful. Current Balance in rs  =" + balance);
        }else{
            System.out.println("Invalid Withdrawal amount or insufficient balance");
        }
    }
   }
   class ATM{
    private bankaccount bankaccount;
    public ATM(bankaccount bankaccount){
        this.bankaccount = bankaccount;
    }
    public void displaymenu(){
        System.out.println("ATM menu: ");
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Exit");
    }
    public void performtransaction(int choice,Scanner scanner){
        switch (choice) {
            case 1:
                System.out.println("Current Balance in rs = " + bankaccount.getbalance());
                break;
            case 2:
                System.out.println("Enter the deposit amount =");
                double depositamount = scanner.nextDouble();
                bankaccount.deposit(depositamount);
                break;
            case 3:
                System.out.println("Enter the withdrawal amount in rs = ");
                double withdrawalamount = scanner.nextDouble();
                bankaccount.Withdraw(withdrawalamount);
                break;
            case 4:
                System.out.println("Exiting Atm. Thankyou Visit Again");
                scanner.close();
                System.exit(0);
        
            default:
            System.out.println("Invalid Choice");
                break;
        }
    }
   }
   public class ATM_Interface {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        System.out.print("enter the initial balance = ");
        double initialbalance = scanner.nextDouble();
        bankaccount bankaccount = new bankaccount(initialbalance);

        ATM atm = new ATM(bankaccount);
        while(true){
            atm.displaymenu();
            System.out.print("select An Option = ");
            int choice = scanner.nextInt();
            atm.performtransaction(choice, scanner);
        }
    }

   }


