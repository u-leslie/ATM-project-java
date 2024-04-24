import com.sun.source.tree.UsesTree;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class Options  extends Account {
Scanner menuInput = new Scanner(System.in);
DecimalFormat moneyFormat = new DecimalFormat("'$' ###,##0.00");
HashMap<Integer,Integer> data = new HashMap<Integer,Integer>();

//validate login info ,customer nbr and pin nbr

    public void getLogin() throws IOException{
     int x=1;
     do {
         try {
             //I've set 3 account privileges
             data.put(9876543, 9876);
             data.put(8989898, 1890);
             data.put(1001000, 1891);


             System.out.println("Welcome to ATM !!");

             //read customer number and  pin-number

             System.out.print("Enter your Customer Number: ");
             setCustomerNumber(menuInput.nextInt());

             System.out.print("Enter your Pin Number: ");
             setPinNumber(menuInput.nextInt());
         }
         //if other characters are passed
         catch (Exception e) {
             System.out.println("\n" + "Invalid character(s). Only numbers." + "\n");
             x = 2;
         }


         //check if entered customer number and pin-number are correct

         for (Entry<Integer, Integer> entry : data.entrySet()) {
             if (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()){
                 getAccountType();
         }
     }

         System.out.println("\n"+"Wrong Customer Number or Pin Number"+"\n");
     }while(x == 1);
    }

    //Display Account type menu with selection

    public void getAccountType(){
        System.out.println("Select the Account you want to access: ");
        System.out.println("Type 1 - Checking Account");
        System.out.println("Type 2 - Saving Account");
        System.out.println("Type 3 - Exit");
        System.out.println("Choice: ");

        selection = menuInput.nextInt();
        switch (selection) {
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("Thank you for using the ATM,Bye.");
                break;
            default:
                System.out.println("\n"+"Invalid choice"+"\n");
                break;
        }
    }

    //Display checking account menu with selections
    public void getChecking() {
        System.out.println("Checking Account: ");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice: ");


        selection = menuInput.nextInt();
        switch (selection) {
            case 1:
                System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()));
                getAccountType();
                break;
            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you for using the ATM");
                break;
            default:
                System.out.println("\n" + "Invalid choice" + "\n");
                break;
        }
    }

    //Display saving account menu in selection
    public  void getSaving(){
        System.out.println("Saving Account: ");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice: ");

        selection = menuInput.nextInt();
        switch (selection) {
            case 1:
                System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance()));
                getAccountType();
                break;
            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getSavingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you for using the ATM");
                break;
            default:
                System.out.println("\n" + "Invalid choice" + "\n");
                break;
        }

    }
    int selection;

}
