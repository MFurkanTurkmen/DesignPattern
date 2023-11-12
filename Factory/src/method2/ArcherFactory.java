package method2;

public class ArcherFactory implements IFactory {
    @Override
    public IEnemy createEnemy() {
        return new Archer();
    }
}
