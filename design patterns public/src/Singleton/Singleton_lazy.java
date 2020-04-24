package Singleton;
//懒汉式，线程不安全
//是否 Lazy 初始化：是
//是否多线程安全：否

public class Singleton_lazy {
    private static Singleton_lazy instance;
    private Singleton_lazy(){}

    public static Singleton_lazy getInstance() {
        if (instance == null) {
            instance = new Singleton_lazy();
        }
        return instance;
    }
}
