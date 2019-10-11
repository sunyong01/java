package homework.equalsTest;

class sample{
    double number=8;

    public double getNumber() {
        return  this.number;
    }

    public boolean equals(Object obj){
        //两者为同一对象时，返回true
       if (this==obj){
           return true;
       }
       //当他们为同一种对象时
       else if (this.getClass()==obj.getClass()){

          sample equalsobj=(sample) obj;
          //内容相同返回true
           if (this.number==equalsobj.getNumber()){
               return true;
           }

       }
       return false;
    }
}
public class Override_equals {
    public static void main(String[] args) {
        sample r = new sample();
        sample b = new sample();
        System.out.println(r.equals(b));
    }
}
