package interface_1.calculate;

public class Controller {
    public static void main(String[] args) {
        Calculator add = new Add();
        Calculator sub = new Sub();

        int addResult = add.calculate(1,2);
        int subResult = sub.calculate(1,2);

        System.out.println("더하기 : " + addResult);
        System.out.println("빼기 : " + subResult);

    }

}
