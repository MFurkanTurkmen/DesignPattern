package firstmethod_synchronized;
// bu yöntem de birden fazla thread aynı anda metodları cagiramazlar
// performans sorunlarına neden olabilir. bir thread işini bitirmeden diger thread metoda ulaşamaz.
// iki adet çözümü var : 1_volatile 2_ atomicreference
public class Singleton {
    private static AlanHesaplama alanHesaplama;
    private static CevreHesaplama cevreHesaplama;

    // synchronized ile tek bir thread'in bu metodu cagirabilir.
    // synchronized kelimesi ile metodu kilitledik ve anahtar da bir tane var.
    // her thread geldiginde anahtarı alır işi bitince bir digerine verir ve sıradaki thread calisir.
    public synchronized static AlanHesaplama getAlanHesaplama() {
        if (alanHesaplama ==null){
            return new AlanHesaplama();
        }
        return alanHesaplama;
    }

    public synchronized static CevreHesaplama getCevreHesaplama(){
        if (cevreHesaplama==null){
            return new CevreHesaplama();
        }
        return cevreHesaplama;
    }

}
