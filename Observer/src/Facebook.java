import java.util.ArrayList;
import java.util.List;

public class Facebook {
    List<Cihazlar> cihazlarList = new ArrayList<>();

    void cihazEkle(Cihazlar cihaz){
        cihazlarList.add(cihaz);
    }
    void  cihazCikart(Cihazlar cihaz){
        cihazlarList.remove(cihaz);
    }
    void mesajGönder(String mesaj){
        for (Cihazlar cihaz: cihazlarList){
            cihaz.mesajiAl(mesaj);
        }
    }

}
