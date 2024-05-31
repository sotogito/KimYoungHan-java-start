package interface_1.calculate;

public class Sub implements Calculator {

    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
