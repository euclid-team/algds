public class Car {
    String model;
    double currentSpeed;

    public Car(String carModel, double speed) {
        model = carModel;
          currentSpeed=speed;
    }
//
//    public void setSpeed(double newSpeed) {
//        currentSpeed = newSpeed;
//    }
//
//    public double getSpeed() {
//        return currentSpeed;
//    }

}

class MainClass{
    public static void main(String[] args) {
        Car car1;
        car1 = new Car("Toyota Corolla", 54);
        System.out.println(car1.model);

        Car[] carinst = new Car[3];
        carinst[0]=new Car("Volvo", 189);
        System.out.println(carinst[0].currentSpeed);

    }
}
