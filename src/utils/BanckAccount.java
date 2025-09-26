package utils;

class BanckAccount {

     private String accountNumber;
    private double balance;
   


    public BanckAccount (){

    }
    public BanckAccount (String accountNumber, double balance, double amount){
        this.accountNumber = accountNumber;
        this.balance = balance;
       
       

    }
    public String getaccountNumber(){
        return accountNumber;
    }

    public void setaccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public double getbalance(){
        return balance;
    }

    public void setbalance(double balance){
        this.balance = balance;
    }





    
}