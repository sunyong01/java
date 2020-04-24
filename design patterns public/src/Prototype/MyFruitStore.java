package Prototype;

import java.util.Hashtable;

public class MyFruitStore {
    private static Hashtable<Integer, MyFruit> furittable=new Hashtable<Integer,MyFruit>();
    public void Add(Integer key,MyFruit fruit){
        furittable.put(key,fruit);
    }
    public MyFruit Get(Integer key) throws CloneNotSupportedException {
        MyFruit fruit=furittable.get(key);
        Object clone = fruit.clone();
        return (MyFruit) clone;
    }

}
