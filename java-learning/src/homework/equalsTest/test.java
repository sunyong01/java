package homework.equalsTest;

public class test {
    /**
     * 以下是 equals == hashcode()  三者的区别
     * ==的要求是：两个变量引用的是同一个对象，才会返回true
     * equals的要求是：两个变量的hashcode()相等，或者其引用的值相等
     */
    public static void main(String[] args) {
        String EDG = "EDG";
        String tester1 = "EDG";
        System.out.println(EDG == tester1);
        System.out.println(EDG.equals(tester1));
        System.out.println(EDG.hashCode() == tester1.hashCode());
        System.out.println("--------------------------------------------------");
        String edg = new String("EDG");
        String tester2 = new String("EDG");
        System.out.println(edg == tester2);
        System.out.println(edg.equals(tester2));
        System.out.println(edg.hashCode() == tester2.hashCode());
    }
}
