package secondmethod_atomicreference;

import java.util.concurrent.atomic.AtomicReference;

public class Singleton {
    private static final AtomicReference<AlanHesaplama> alanHesaplama= new AtomicReference<>();
    private static final AtomicReference<CevreHesaplama> cevvreHesaplama= new AtomicReference<>();

    public static AlanHesaplama getAlanHesaplama(){
        if (alanHesaplama.get()==null){
            // alan hesaplamaya bak eger null ise yenisini olustur diyoruz.
            AlanHesaplama newAlanHesaplama= new AlanHesaplama();
            /*
            alanHesaplama referansının mevcut değeri null ise,
            compareAndSet metodunu kullanarak, null değeriyle karşılaştır ve newAlanHesaplama ile değiştirme işlemi gerçekleştir.
            Eğer bu işlem başarılı olursa (yani mevcut değer null ise), newAlanHesaplama örneğini döndür.
            Eğer bu işlem başarısız olursa (yani mevcut değer null değilse),
            alanHesaplama'nın şu anki değerini döndür (başka bir thread önce davranmış ve referansı değiştirmiştir).
             */
            if (alanHesaplama.compareAndSet(null,newAlanHesaplama)){
                return newAlanHesaplama;
            }else {
                 return alanHesaplama.get(); // baska bir thread önce davranmis. ve referansı degistirmiş. o referansı dön.
            }
        }
        return alanHesaplama.get();

    }


}
