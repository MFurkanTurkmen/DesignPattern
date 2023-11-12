package method2;

public class AudiFactory implements IAudiFactory{
    @Override
    public AudiCar createAudiCar() {
        return new AudiCar();
    }

    @Override
    public AudiMotorCycle createAudiMotorCycle() {
        return new AudiMotorCycle();
    }
}
