package homework.interface_animal;

public class auto implements autoanimal {
    /**
     * 默认的animal
     */
    public String is = "ANIMAL";
    public String move = "MOVE";
    public String eat = "FOOD";
    /**
     *构造器
     */
    auto(String is,String move,String eat){
        this.eat=eat;
        this.move=move;
        this.is=is;
    }
    @Override
    public void is() {
        System.out.println("I'm " + is);
    }

    @Override
    public void move() {
        System.out.println("I " + move);
    }

    @Override
    public void eat() {
        System.out.println("I eat " + eat);
    }

    @Override
    public void say() {
        System.out.println("I'm " + is + ",i " + move + " and i eat " + eat + "!");
    }


}
