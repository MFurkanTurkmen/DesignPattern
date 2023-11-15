public class YeniSiparisDurumu implements SiparisDurumu{

    @Override
    public void durumuIsle(SiparisIslemleri siparisIslemleri) {
        System.out.println("siparis alindi");
        siparisIslemleri.durumuDegistir(new HazirlaniyorDurumu());
    }
}
