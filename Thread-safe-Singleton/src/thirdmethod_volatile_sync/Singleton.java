package thirdmethod_volatile_sync;

public class Singleton {
    /*
Eğer volatile keyword'ünü kaldırırsanız,
çift kontrol (double-checked locking) mekanizmasının doğru çalışmasını sağlamak
ve çoklu thread ortamlarında güvenli bir Singleton örneği oluşturmak için başka bir
senkronizasyon mekanizması eklemeniz gerekebilir.
Çünkü volatile, değişkenin değerini ana belleğe yazma ve her defasında ana bellekten okuma garantisi verir,
bu da çoklu thread ortamlarında güvenliğin sağlanmasına yardımcı olur.

İlgili kodda, eğer volatile keyword'ü kaldırılırsa, çift kontrol mekanizması doğru çalışmayabilir
ve çoklu thread'ler arasında güvenli bir Singleton oluşturmakta sorunlar yaşanabilir.
Çünkü Java'nın çift kontrol mekanizması, değişkenin ilk oluşturulma anında senkronize
bir şekilde doğru bir şekilde kontrol edilebilmesi için volatile'a ihtiyaç duyar.
*/
    private static volatile AlanHesaplama alanHesaplama;
    private static volatile CevreHesaplama cevreHesaplama;

    public static AlanHesaplama getAlanHesaplama() {
        if (alanHesaplama == null) {
            synchronized (Singleton.class) {
                if (alanHesaplama == null) {
                    alanHesaplama = new AlanHesaplama();
                }
            }
        }
        return alanHesaplama;
    }

    public static CevreHesaplama getCevreHesaplama() {
        if (cevreHesaplama == null) {
            synchronized (Singleton.class) {
                if (cevreHesaplama == null) {
                    cevreHesaplama = new CevreHesaplama();
                }
            }
        }
        return cevreHesaplama;
    }
}
