package interface_1.payment;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void pay(int amount){
        System.out.println("신용카드로 " + amount + "만큼 결제되었습니다.");
    }
}
