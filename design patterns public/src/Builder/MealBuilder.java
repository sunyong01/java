package Builder;

public class MealBuilder {
    Meal meal=new Meal();
    void buildFood(){
        meal.setFood("");
    }
    void buildDrink(){
        meal.setDrink("");
    }

    public Meal getMeal() {
        return meal;
    }
}

