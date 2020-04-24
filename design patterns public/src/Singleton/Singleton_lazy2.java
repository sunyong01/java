package Singleton;

//懒汉式，线程安全
//是否 Lazy 初始化：是
//是否多线程安全：是

public class Singleton_lazy2 {
    private static Singleton_lazy2 instance;
    private Singleton_lazy2(){}
    public static synchronized Singleton_lazy2 getInstance() {
        if (instance == null) {
            instance = new Singleton_lazy2();
        }
        return instance;
    }
}
