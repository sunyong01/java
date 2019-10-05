package homework.interface_animal;

class bird extends auto{
    public static String is = "bird";
    public static String move = "fly";
    public static String eat = "bugs";

    /**
     *调用 super() 即auto的构造器
     */
    bird(){
        super(bird.is,bird.move,bird.eat);
    }

}