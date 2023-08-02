package entities;

public class CurrencyCoverter {
    public double dolar;

    public final double Iof = 0.06;

    public double coverter(double amount){
       return amount * dolar *(1 + Iof);
    }
}
