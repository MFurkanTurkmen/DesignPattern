public class Telefon implements Cihazlar {
    @Override
    public void mesajiAl(String mesaj) {
        System.out.println("telefon mesajı aldı mesaj içeriği: "+mesaj);
    }
}
