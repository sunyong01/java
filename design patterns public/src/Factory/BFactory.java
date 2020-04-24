package Factory;

public class BFactory extends Factory {
    public Fruit CreateFruit(String Kind){
            return new Banana();
    }
}
