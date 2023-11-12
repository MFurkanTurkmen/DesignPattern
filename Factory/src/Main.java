import method1.EnemyFactory;
import method1.IEnemy;

public class Main {
    public static void main(String[] args) {
        EnemyFactory enemyFactory=new EnemyFactory();
        IEnemy archer=enemyFactory.createEnemy("method1.Archer");
        archer.attack();
        IEnemy caval= enemyFactory.createEnemy("cavalry");
        caval.attack();
    }
}