package method2;

public class Main2 {

    public static void main(String[] args) {
        // archer factory sadece okçu ürettigi için
        // atack metodu ok atıcaktır.
        IFactory factory= new ArcherFactory();
        IEnemy archer=factory.createEnemy();
        archer.attack();
    }
}
