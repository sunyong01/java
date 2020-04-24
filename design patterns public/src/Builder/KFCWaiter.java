package Builder;

public class KFCWaiter {
    private MealBuilder mb;
    void setMealBuilder(MealBuilder mb){
        this.mb=mb;
    }
    Meal construct(){
        mb.buildDrink();
        mb.buildFood();
        return mb.getMeal();
    }
}
