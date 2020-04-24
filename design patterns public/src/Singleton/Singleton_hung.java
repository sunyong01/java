package Singleton;

//饿汉式
//是否 Lazy 初始化：否
//是否多线程安全：是

public class Singleton_hung {
    private static Singleton_hung instance = new Singleton_hung();
    private Singleton_hung(){}
    public static Singleton_hung getInstance() {
        return instance;
    }
}
