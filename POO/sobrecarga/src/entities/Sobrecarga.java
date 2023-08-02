package entities;

public class Sobrecarga {
    private Integer number;
    private String holder;
    private Double balance;

    public Sobrecarga(){
    }

    public Sobrecarga(Integer number, String holder, Double initialDeposit){
         this.number = number;
         this.holder = holder;
         this.balance = initialDeposit;
    }
    public Sobrecarga(Integer number, String holder){
        this.number = number;
        this.holder = holder;
    }
    public Integer getNumber(){
        return number;
    }
    public String getHolder(){
        return holder;
    }
    public void setHolder(String holder){
        this.holder = holder;
    }
    public Double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withDraw(double amount){
        balance -= amount + 5;
    }
    public String toString(){
        return "Account " + number + ", holder: "+holder + ", Balance: $"+balance;
    }

}
