package homework;

/**
 * 长江大学 SY 2019.9.26
 */
public class n_factorial {


    private static class factorial {
        private long number = 1;
        private int count = 1;

        private long tester() {
            number = number * count;
            count++;
            return number;
        }
    }

    public static void main(String[] args) {
        factorial test = new factorial();
        long big_number;
        while (true) {
            big_number = test.tester();
            System.out.println(big_number);
            if (big_number < 0) {
                System.out.println(test.count + 1 + "的阶乘>long的最大值");
                System.out.println("系统支持的最大long类型的大小：" + Long.MAX_VALUE);
                return;
            }
        }
    }


}


