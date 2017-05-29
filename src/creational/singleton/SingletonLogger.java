package creational.singleton;


public class SingletonLogger {

    private static SingletonLogger singletonLogger;
    private static String logger = "This is simple singleton logger: \n";

    private SingletonLogger(){}

    public static SingletonLogger getSingletonLogger(){
        if (singletonLogger == null){
            singletonLogger = new SingletonLogger();
        }
        return singletonLogger;
    }

    public String addLog(String log){
        return logger += log + "\n";
    }

    public String showLog(){
        return logger;
    }

}
