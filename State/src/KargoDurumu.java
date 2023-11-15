public class KargoDurumu implements SiparisDurumu{
    @Override
    public void durumuIsle(SiparisIslemleri siparisIslemleri) {
        System.out.println("kargoya verildi");
        siparisIslemleri.durumuDegistir(new TeslimEdildiDurumu());
    }
}
