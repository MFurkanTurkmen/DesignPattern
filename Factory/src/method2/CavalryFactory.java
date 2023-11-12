package method2;

public class CavalryFactory implements IFactory{
    @Override
    public IEnemy createEnemy() {
        return new Cavalry();
    }
}
