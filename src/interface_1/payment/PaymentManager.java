package interface_1.payment;

public class PaymentManager {
    PaymentStrategy paymentStrategy;

    //결제 방법에 따라 다른 객체가 생성 (결제라는 같은 동작에 다른 결제 방법)
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    //각각 구현되어있는 pay 메서드 실행
    public void checkPayment(int amount) {
        if(paymentStrategy != null){
            paymentStrategy.pay(amount);
        }
    }

}
