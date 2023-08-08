package services;

public interface OnlinetPaymentService {
    double paymentFee(double amount);
    double interest(double amount, int months);
}
