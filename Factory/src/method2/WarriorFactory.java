package method2;

public class WarriorFactory implements IFactory{

    @Override
    public IEnemy createEnemy() {
        return new Warrior();
    }
}
