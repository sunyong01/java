package Iterator;

public class Client {
    public static void display(Television tv){
        TViterator i=tv.createIterator();
        System.out.println("channel:");
        while (!i.isLast()){
            System.out.println(i.currentChannel());
            i.next();
        }
    }


    public static void main(String[] args) {
        display(new SkyworthTelevision());
    }
}
