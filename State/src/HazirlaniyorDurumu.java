public class HazirlaniyorDurumu implements SiparisDurumu{
    @Override
    public void durumuIsle(SiparisIslemleri siparisIslemleri) {
        System.out.println("siparis hazirlanıyor.");
        siparisIslemleri.durumuDegistir(new KargoDurumu());
    }
}
