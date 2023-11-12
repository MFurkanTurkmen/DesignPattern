package method2;

public class BmwFactory implements IBmwFactory {
    @Override
    public BmwCar createBmwCar() {
        return new BmwCar();
    }

    @Override
    public BmwMotorCycle createBmwMotorCycle() {
        return new BmwMotorCycle();
    }
}
