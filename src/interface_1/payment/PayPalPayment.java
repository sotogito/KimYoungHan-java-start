package interface_1.payment;

public class PayPalPayment implements PaymentStrategy{
    @Override
    public void pay(int amount){
        System.out.println("페이팔로 " + amount + "만큼 결제 되었습니다.");
    }

}
