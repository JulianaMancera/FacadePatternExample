public class CarFacade{

    private Car car;

    public CarFacade(Car car){

    }

    public void drive(){
        car.start();
        car.acceleration();

        car.brake();
        car.stop();
    }
}