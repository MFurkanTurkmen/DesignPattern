

public class AudiFactory implements CarFactory {

    @Override
    public IMotor createMotorFactory() {
        return new AudiMotorCycle();
    }

    @Override
    public ICar createCarFactory() {
        return new AudiCar();
    }
}
