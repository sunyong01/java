package Prototype;

public class ClientClass {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyFruit fruit1=new Apple();
        MyFruit fruit2=fruit1;
        MyFruit fruit3= (MyFruit) fruit1.clone();
        fruit1.Display();
        System.out.println("fruit1"+fruit1.hashCode());
        fruit2.Display();
        System.out.println("fruit2"+fruit2.hashCode());
        fruit3.Display();
        System.out.println("fruit3"+fruit3.hashCode());
        System.out.println(fruit1.equals(fruit3));
        MyFruitStore store =new MyFruitStore();
        store.Add(1,fruit1);
        store.Add(2,fruit3);
        store.Add(3,new Apple());
        store.Add(4,new Banana());
        MyFruit fruit =store.Get(3);
        fruit.Display();
        System.out.println(fruit.hashCode());



    }

}
