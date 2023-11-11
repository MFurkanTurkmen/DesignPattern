// ayrı bir sınıfta oluşturarak yapabilirsin yada 2. yollada yapabilirsin
public class Singleton {
    private static AlanHesaplama alanHesaplama;
    private static CevreHesaplama cevreHesaplama;

    public static AlanHesaplama getAlanHesaplama(){
        if (alanHesaplama==null){
            return new AlanHesaplama();
        }return alanHesaplama;
    }

    public static CevreHesaplama getCevreHesaplama(){
        if (cevreHesaplama==null){
            return new CevreHesaplama();
        }return cevreHesaplama;
    }
}
