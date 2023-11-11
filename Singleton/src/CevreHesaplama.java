public class CevreHesaplama {
    // singleton 2.yol
    private static CevreHesaplama cevreHesaplama;

    public int dikdörtgencevre(int kenar1 ,int kenar2){
        return (kenar1*2)+(kenar2*2);
    }
    public int karecevre(int kenar){
        return kenar*4;

    }
    // singleton 2.yol devam
    public static CevreHesaplama getInstance(){
        if (cevreHesaplama==null){
            return new CevreHesaplama();
        }return cevreHesaplama;
    }

}
