import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // firstMethod();
        // secondMethod();
        // thirdMethod();
        Map<String, String> envVariables = System.getenv();

        envVariables.entrySet().forEach(System.out::println);
    }
    public static void firstMethod(){
        new Thread(()->{
            System.out.println(firstmethod_synchronized.Singleton.getAlanHesaplama().kareAlan(2));
        }).start();
        new Thread(()->{
            System.out.println(firstmethod_synchronized.Singleton.getAlanHesaplama().kareAlan(3));
        }).start();
        new Thread(()->{
            System.out.println(firstmethod_synchronized.Singleton.getAlanHesaplama().kareAlan(4));
        }).start();
        new Thread(()->{
            System.out.println(firstmethod_synchronized.Singleton.getAlanHesaplama().kareAlan(5));
        }).start();
        new Thread(()->{
            System.out.println(firstmethod_synchronized.Singleton.getAlanHesaplama().kareAlan(6));
        }).start();
        new Thread(()->{
            System.out.println(firstmethod_synchronized.Singleton.getAlanHesaplama().kareAlan(7));
        }).start();
    }

    public static void secondMethod(){
        new Thread(()->{
            System.out.println(secondmethod_atomicreference.Singleton.getAlanHesaplama().kareAlan(2));
        }).start();
        new Thread(()->{
            System.out.println(secondmethod_atomicreference.Singleton.getAlanHesaplama().kareAlan(3));
        }).start();
        new Thread(()->{
            System.out.println(secondmethod_atomicreference.Singleton.getAlanHesaplama().kareAlan(4));
        }).start();
        new Thread(()->{
            System.out.println(secondmethod_atomicreference.Singleton.getAlanHesaplama().kareAlan(5));
        }).start();
        new Thread(()->{
            System.out.println(secondmethod_atomicreference.Singleton.getAlanHesaplama().kareAlan(6));
        }).start();
        new Thread(()->{
            System.out.println(secondmethod_atomicreference.Singleton.getAlanHesaplama().kareAlan(7));
        }).start();
    }


    public static void thirdMethod(){
        new Thread(()->{
            System.out.println(thirdmethod_volatile_sync.Singleton.getAlanHesaplama().kareAlan(2));
        }).start();
        new Thread(()->{
            System.out.println(thirdmethod_volatile_sync.Singleton.getAlanHesaplama().kareAlan(3));
        }).start();
        new Thread(()->{
            System.out.println(thirdmethod_volatile_sync.Singleton.getAlanHesaplama().kareAlan(4));
        }).start();
        new Thread(()->{
            System.out.println(thirdmethod_volatile_sync.Singleton.getAlanHesaplama().kareAlan(5));
        }).start();
        new Thread(()->{
            System.out.println(thirdmethod_volatile_sync.Singleton.getAlanHesaplama().kareAlan(6));
        }).start();
        new Thread(()->{
            System.out.println(thirdmethod_volatile_sync.Singleton.getAlanHesaplama().kareAlan(7));
        }).start();
    }
}