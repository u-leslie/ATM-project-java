import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
Scanner input = new Scanner(System.in);
DecimalFormat moneyFormat = new DecimalFormat("'$' ###,##0.00");

    //set customer number
    public int setCustomerNumber(int customerNumber){
        this.customerNumber =customerNumber;
        return customerNumber;
    }
    //get customer number
    public int getCustomerNumber(){
        return customerNumber;
    }

    //set pin-number
    public int setPinNumber(int pinNumber){
        this.pinNumber =pinNumber;
        return pinNumber;
    }
    //get pin-number
    public int getPinNumber(){
        return pinNumber;
    }

    //get checking account balance
    public double getCheckingBalance(){
        return checkingBalance;
    }

    //get saving account balance
    public double getSavingBalance(){
        return savingBalance;
    }

    //calculate the checking account withdrawal

    public double calcCheckingWithdraw(double amount){
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }

    //calculate the saving account withdrawal

    public double calcSavingWithdraw(double amount){
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }

    //calculate the checking account deposit

    public double calcCheckingDeposit (double amount){
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }

    //calculate the saving account deposit

    public double calcSavingDeposit(double amount){
        savingBalance = (savingBalance + amount);
        return savingBalance;
    }

    //customer checking account withdrawal input
    public void getCheckingWithdrawInput(){
        System.out.println("Checking Account Balance: "+moneyFormat.format(checkingBalance));
        System.out.print("Amount you want to withdraw from checking Account: ");
        double amount = input.nextDouble();
        if ((checkingBalance - amount)>=0){
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account balance" + moneyFormat.format(checkingBalance));
        }else{
            System.out.println("Balance cannot be negative" + "\n");
        }
    }

    //customer saving account withdrawal input
    public void getSavingWithdrawInput(){
        System.out.println("Saving Account Balance: "+moneyFormat.format(savingBalance));
        System.out.print("Amount you want to withdraw from saving Account: ");
        double amount = input.nextDouble();
        if ((savingBalance - amount)>=0){
            calcSavingWithdraw(amount);
            System.out.println("New Saving Account balance" + moneyFormat.format(savingBalance));
        }else{
            System.out.println("Balance cannot be negative" + "\n");
        }
    }


    //customer checking account withdrawal input
    public void getCheckingDepositInput(){
        System.out.println("Checking Account Balance: "+moneyFormat.format(checkingBalance));
        System.out.print("Amount you want to withdraw from checking Account: ");
        double amount = input.nextDouble();
        if ((checkingBalance + amount)>=0){
            calcCheckingDeposit(amount);
            System.out.println("New Checking Account balance" + moneyFormat.format(checkingBalance));
        }else{
            System.out.println("Balance cannot be negative" + "\n");
        }
    }

    //customer saving account withdrawal input
    public void getSavingDepositInput(){
        System.out.println("Saving Account Balance: "+moneyFormat.format(savingBalance));
        System.out.print("Amount you want to withdraw from saving Account: ");
        double amount = input.nextDouble();
        if ((savingBalance + amount)>=0){
            calcSavingDeposit(amount);
            System.out.println("New Saving Account balance" + moneyFormat.format(savingBalance));
        }else{
            System.out.println("Balance cannot be negative" + "\n");
        }
    }
  private  int customerNumber;
  private int pinNumber;
  private double checkingBalance = 0;
  private double savingBalance = 0;

}
