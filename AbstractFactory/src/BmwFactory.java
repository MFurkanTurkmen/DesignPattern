
public class BmwFactory implements CarFactory {


    @Override
    public IMotor createMotorFactory() {
        return new BmwMotorCycle();
    }

    @Override
    public ICar createCarFactory() {
        return new BmwCar();
    }
}
