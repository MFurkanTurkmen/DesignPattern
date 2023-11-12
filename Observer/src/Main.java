public class Main {
    public static void main(String[] args) {
        Facebook facebook= new Facebook();
        facebook.cihazEkle(new Telefon());
        facebook.cihazEkle(new Laptop());
        facebook.mesajGönder("ali arkadasin olmak istiyor...");
    }
}