package object_1;

public class ObjectMainController {
    private static final String company = "현대";
    private static final String carName = "붕붕";
    private static final String color = "빨강";
    private static final int speed = 200;

    private static final int nowSpeed = 100;

    public static void main(String[] args) {
        ObjectMainController controller = new ObjectMainController();
        controller.mainController();
    }


    private void mainController(){
        Car car = makeCar();
        CarStatus carStatus = makeCarStatus();

        carListPrinter(car,carStatus);
    }

    private void carListPrinter(Car car, CarStatus carStatus){
        System.out.println(car.getCompany());
        System.out.println(car.getCarName());
        System.out.println(car.getColor());
        System.out.println(car.getSpeed());
        System.out.println(carStatus.getNowSpeed());
    }

    private Car makeCar(){
        return new Car(company,carName,color,speed);
    }

    private CarStatus makeCarStatus(){
        return new CarStatus(nowSpeed);
    }
    

}
