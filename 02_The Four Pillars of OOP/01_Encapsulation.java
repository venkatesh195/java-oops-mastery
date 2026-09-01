import java.util.*;
class BankAccount{

  private int accountNumber;
  private String holderName;
  private double balance;
  

  public void setAccountNumber(int accountNumber){
    this.accountNumber=accountNumber;
  }
  public void setHolderName(String holderName){
    this.holderName=holderName;
  }
  public void setBalance(double balance){
    if(balance>=0){
      this.balance=balance;
    }
  }
  public int getAccountNumber(){
    return accountNumber;
  }
  public String getHolderName(){
    return holderName;
  }
  public double getBalance(){
    return balance;
  }
  public void deposit(double amount){
    if(amount>0){
      balance+=amount;
    }
  }
  public void withdraw(double amount){
    if(amount>0 && amount<=balance){
      balance-=amount;
    }
  } 

}

public class Main {
    public static void main(String[] args) {

      BankAccount ba=new BankAccount();
      ba.setAccountNumber(12345678);
      ba.setHolderName("venkatesh");
      ba.setBalance(50);

      System.out.println("Account Number:- "+ba.getAccountNumber());
      System.out.println("Holder Name:- "+ba.getHolderName());
      System.out.println("Balance:- "+ba.getBalance());


      ba.deposit(10000);
      ba.withdraw(5000);

      System.out.println("Balance:- " + ba.getBalance());

    }
}
