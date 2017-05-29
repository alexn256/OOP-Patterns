package creational.singleton;


public class Program {
    public static void main(String[] args) {
        System.out.println(SingletonLogger.getSingletonLogger().showLog());
        SingletonLogger.getSingletonLogger().addLog("First Log...");
        System.out.println(SingletonLogger.getSingletonLogger().showLog());
    }
}
