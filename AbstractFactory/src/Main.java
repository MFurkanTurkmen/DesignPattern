


public class Main {
    public static void main(String[] args) {
        // peki burada CarFactory i nerede kullanacagiz
        // sürekli new Audi Factory diyerek audi fabrikası üretiyoruz.
        // ben new AudiFactory üretimini CarFactory üzerinden yapabilirim.
        ICar rs7= new AudiFactory().createCarFactory();
        ICar m5cs= new BmwFactory().createCarFactory();
        IMotor rs1200= new BmwFactory().createMotorFactory();
        ICar x5= new BmwFactory().createCarFactory();
        ICar s6= new AudiFactory().createCarFactory();

        // yukarıda sürekli yeni fabrika üretimine gerek yok.
        // bir tane CarFactory Sınıfından fabrika üretilir o kullanılır.
        // aşağıda örneği mevcut
        CarFactory audiFactory= new AudiFactory();
        ICar rsq8= audiFactory.createCarFactory();



    }
}