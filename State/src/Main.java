public class Main {
    public static void main(String[] args) {

        SiparisIslemleri siparisIslemleri = new SiparisIslemleri();
        siparisIslemleri.sonrakiDurum();
        siparisIslemleri.sonrakiDurum();
        siparisIslemleri.sonrakiDurum();
        siparisIslemleri.sonrakiDurum();
        siparisIslemleri.durumuDegistir(new KargoDurumu());
        siparisIslemleri.sonrakiDurum();
    }
}