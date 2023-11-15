public class SiparisIslemleri {
    private SiparisDurumu siparisDurumu;
    int count=0;
    int count1=0;
    int count2=0;
    SiparisIslemleri(){
        count++;
        System.out.println("islemler count: "+count);
        this.siparisDurumu= new YeniSiparisDurumu();
    }

    public void durumuDegistir(SiparisDurumu siparisDurumu){
        count1++;
        System.out.println("durumu degistir count: "+count2);
        this.siparisDurumu=siparisDurumu;
    }
    public void sonrakiDurum(){
        count2++;
        System.out.println("sonraki durum count: "+ count2);
        siparisDurumu.durumuIsle(this);
    }
}
