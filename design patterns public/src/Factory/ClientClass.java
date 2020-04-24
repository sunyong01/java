package Factory;


import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLReporter;
import java.beans.XMLDecoder;

public class ClientClass {
    public static void main(String[] args) throws ParserConfigurationException {
        Factory factory =new Factory();
        Factory bfactory =new BFactory();

        Fruit fruit=(Fruit)XMLUtil.getBean();
//        Fruit fruit=factory.CreateFruit("A");
        fruit.eat();
        Fruit fruit2=factory.CreateFruit("B");
        fruit2.eat();




    }
    public String factory(String fruitName){
        if (fruitName.equals("Apple")){
            return "Apple";
        }
        if (fruitName.equals("Banana")){
            return "Banana";
        }

        return null;
    }
}
