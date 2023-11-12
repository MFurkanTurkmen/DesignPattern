package method1;

public class EnemyFactory {
    public IEnemy createEnemy(String enemyType){
        if (enemyType.equalsIgnoreCase("archer")){
            System.out.println("archer create");
            return new Archer();
        } else if (enemyType.equalsIgnoreCase("cavalry")) {
            System.out.println("cavalry create");
            return new Cavalry();
        } else if (enemyType.equalsIgnoreCase("warrior")) {
            System.out.println("warrior create");
            return new Warrior();
        }else {
            throw new RuntimeException("yanlis bir sinif girdiniz");
        }

    }
}
