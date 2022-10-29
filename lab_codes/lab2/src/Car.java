public class Car extends Vehicle {
    private String model;
//    private double currentSpeed;

    public Car(String carModel, double speed, int wheels) {
        model = carModel;
        super.Vehicle(wheels, speed);
    }

    public Car(String carModel) {
        model = carModel;
    }

    public String getModel(){
        return model;
    }

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
        car1 = new Car("Toyota Corolla", 185, 4);
        System.out.println(car1.speed);
//        car1.setSpeed(196);
//        System.out.println(car1.getSpeed());


//        Car[] carinst = new Car[3];
//        carinst[0]=new Car("Volvo", 189);
//        System.out.println(carinst[0].getSpeed());

    }
}
