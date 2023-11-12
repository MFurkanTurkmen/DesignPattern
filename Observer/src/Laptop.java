public class Laptop implements Cihazlar {
    @Override
    public void mesajiAl(String mesaj) {
        System.out.println("laptop mesajı aldı mesaj içeriği: "+mesaj);
    }
}
