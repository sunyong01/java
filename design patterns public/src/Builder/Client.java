package Builder;

import javax.xml.parsers.ParserConfigurationException;

public class Client {
    public static void main(String[] args) throws ParserConfigurationException {
        MealBuilder mb = (MealBuilder) XMLUtil.getBean();
        KFCWaiter waiter =new KFCWaiter();
        waiter.setMealBuilder(mb);
        Meal meal=waiter.construct();
        System.out.println(meal.getDrink());
        System.out.println(meal.getFood());
    }
}
