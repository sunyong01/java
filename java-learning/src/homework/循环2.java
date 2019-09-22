package homework;

public class 循环2 {
    public static void main(String[] args) {
        String[] name;
        String[] city;
        String[] country;
        /**
         * 以下数据由python-faker库随机生成
         *   被注释的代码是因为随机数有重复
         */
        name = new String[]{"罗俊","常梅","赵瑜","张桂花","赵玲","柳凯","羊瑜","康静","郭东","孙刚","郭英","贾荣","雷秀芳","李超","李勇","王红","邓秀英","何岩","尹柳","韦冬梅"};
        city = new  String[]{"江北","崇文","蓟州","东丽","华龙","孝南","南溪","黄浦","白云","新城","淄川","平山","龙潭","翔安","大东","沙市","锡山","新城","普陀","普陀"};
        country = new  String[]{"冰岛","马拉维","挪威","爱尔兰","斯洛文尼亚","日本","坦桑尼亚","古巴","瑙鲁","乌干达","法罗群岛","阿根廷","威克岛","帕劳","莫桑比克","奥地利","白俄罗斯","瓦里斯和富士那群岛","索马里","西萨摩亚",};
        /**     for (int m=0;m<name.length;m++) {
         int p = (int) (Math.random() * (name.length));
         int q = (int) (Math.random() * (city.length));
         int r = (int) (Math.random() * (country.length));
         System.out.println(name[p]+"，祖籍"+city[q]+"，现居"+country[r]);

         }
         */
        for (String n : name) {
            int q = (int) (Math.random() * (city.length));
            int r = (int) (Math.random() * (country.length));
            System.out.println(n+"，祖籍"+city[q]+"，现居"+country[r]);
        }
    }
}
