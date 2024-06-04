package interface_1.payment;

public class MainController {

    public static void main(String[] args) {
        //인터페이스 변수가 있는 클래스 인스턴스 생성
        PaymentManager paymentManager = new PaymentManager();

        //신용카드 시 객체 생성
        paymentManager.setPaymentStrategy(new CreditCardPayment());

        paymentManager.checkPayment(100);

        paymentManager.setPaymentStrategy(new PayPalPayment());
        paymentManager.checkPayment(100);








    }
}
