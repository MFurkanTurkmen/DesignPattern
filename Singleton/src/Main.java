public class Main {
    public static void main(String[] args) {
        AlanHesaplama alanHesaplama= Singleton.getAlanHesaplama();
        int alan=alanHesaplama.dikdörtgenAlani(2,3);
        System.out.println(alan);
        System.out.println(alanHesaplama.kareAlani(33));

    }
}