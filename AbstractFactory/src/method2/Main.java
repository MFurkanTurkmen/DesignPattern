package method2;

public class Main {
    public static void main(String[] args) {

        BmwCar m4= new BmwFactory().createBmwCar();
        m4.hizlandi();
        BmwMotorCycle rs1200= new BmwFactory().createBmwMotorCycle();
        rs1200.onKaldir();
    }
}
