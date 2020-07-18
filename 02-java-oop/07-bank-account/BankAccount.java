package BankAssignment;
import java.util.Random;

/**
 * BankAccount
 */
public class BankAccount {
    protected String accountNumber;
    protected Double checkingBalance;
    protected Double savingsBalance;
    public static double accountTotal = 0;
    public static double balanceStored = 0;

    public Double getCheckingBalance(){
        return this.checkingBalance;
    }

    public void setAccountNumber(Double checkingBalance){
        this.checkingBalance = checkingBalance;
    }

    public Double getSavingsBalance(){
        return this.savingsBalance;
    }

    public void setSavingsBalance(Double savingsBalance){
        this.savingsBalance = savingsBalance;
    }

    public BankAccount(){

    }

    public BankAccount(String accountNumber, Double checkingBalance, Double savingsBalance, int accountTotal, double balanceStored){
        accountNumber = randomAccountNum();
    }

    public BankAccount(String accountNumber){
        this.accountNumber = accountNumber;
    }


    public static void numberOfCurrentAccounts(){

    }

    public static void totalMoneyInBank(Double checkingBalance, Double savingsBalance){
        accountTotal  = checkingBalance + savingsBalance;
        System.out.println(accountTotal);
    }

    private static String randomAccountNum() {
        StringBuilder word = new StringBuilder(10); 
        String AlphaNumericString = "0123456789";
        for (int i = 0; i < 10; i++){
            int index = (int)(AlphaNumericString.length() * Math.random());
            word.append(AlphaNumericString.charAt(index));
        }
        String sword = String.valueOf(word.toString());
        return sword;
    }
    
    public void depositMoney(String account, Double amount){
        if(account.equals("checking")){
            checkingBalance += amount;
        }
        
        if(account.equals("savings")){
            savingsBalance += amount;
        }
    }

    public void withdrawlMoney(String account, Double amount){
        if(account.equals("checking")){
            checkingBalance -= amount;
        }
        
        if(account.equals("savings")){
            savingsBalance -= amount;
        }
    }

    public void checkChecking(){
        System.out.println(getCheckingBalance());
    }

    public void checkSavings(){
        System.out.println(getSavingsBalance());
    }


}

